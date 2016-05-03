package com.bjitacademy.finalproject.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bjitacademy.finalproject.domains.BankAccountLedger;
import com.bjitacademy.finalproject.domains.LedgerAccount;

public class LedgerAccountHibernateDao implements LedgerAccountDao{
	
	private SessionFactory sessionFactory;
	public LedgerAccountHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public Integer insert(LedgerAccount ledgeraccount) {
		Transaction transaction = null;
		Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			i = (Integer)session.save(ledgeraccount);
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return i;
	}


	@Override
	public List getBankAccountLedger(BigDecimal bankaccntnumber) {
		
		Transaction transaction = null;
		//Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{				
			//System.out.println(bankaccntnumber);
			String hql = " SELECT B.bankAccNumber, B.bankAccountType, B.balance,B.currency, B.activeStatus,  sum(L.depositAmount) as totdepositAmount, sum(L.widrawAmount) as totwidrawAmount,sum(L.interestAmount) as interestAmount  "
					+"  FROM BankAccountLedger AS B LEFT JOIN B.accountledgers as L "
						+" where B.bankAccNumber = :bankAccNumber "
						+" GROUP BY B.bankAccNumber, B.bankAccountType, B.balance,B.currency, B.activeStatus ";
				Query query = session.createQuery(hql);
				query.setBigDecimal("bankAccNumber", bankaccntnumber);
				
			List results = query.list();					
			transaction.commit();
			return results;
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}


	@Override
	public List<LedgerAccount> getLedgerDetails(
			BigDecimal bankaccntnumber) {
		
		Transaction transaction = null;
		//Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{				
			System.out.println(bankaccntnumber);
			//String hql = "select L.ledgerDate, TO_CHAR(L.ledgerDate,'DD-MON-YYYY') AS ledgerDate, L.refInfo, L.description, L.depositAmount, L.widrawAmount,"
			//		+ " L.interestAmount, L.ledgerId, L.bankAccNumber "
					String hql =  "FROM LedgerAccount AS L "					
						+" where L.bankAccNumber = :bankAccNumber "
						+" order by L.ledgerId DESC 15";
						
				Query query = session.createQuery(hql);
				query.setBigDecimal("bankAccNumber", bankaccntnumber);				
				//query.setMaxResults(15);
				
			List<LedgerAccount> results = (List<LedgerAccount>)query.list();					
			transaction.commit();
			return results;
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
		
	}
	
	
	

}
