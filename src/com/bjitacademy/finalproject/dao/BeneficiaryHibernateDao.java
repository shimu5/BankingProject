package com.bjitacademy.finalproject.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.Beneficiary;

public class BeneficiaryHibernateDao implements BeneficiaryDao{

	private SessionFactory sessionFactory;
	public BeneficiaryHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Beneficiary getBeneficiary(Integer id) {

		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			Beneficiary beneficiary=(Beneficiary)session.get(Beneficiary.class,id);
			return beneficiary;
		} finally {
			transaction.commit();
			session.close();
		}
	}

	public Integer insert(Beneficiary beneficiary) {
		Transaction transaction = null;
		Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			System.out.println(beneficiary.toString());
			i = (Integer)session.save(beneficiary);
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
	
	public List<Beneficiary> getAllBeneficiaries(Integer bankAccountNumber ) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			
			Criteria criteria = session.createCriteria(Beneficiary.class);
			criteria.add(Restrictions.eq("userBankAccountNumber", bankAccountNumber));
			 List<Beneficiary> blist= criteria.list();
			 return blist;
			
		} catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally {
			transaction.commit();
			session.close();
		}
		return null;
	}
	
	
	public void delete(Beneficiary beneficiary) {
		Transaction transaction = null;		
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{			
			session.delete(beneficiary);
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

}
