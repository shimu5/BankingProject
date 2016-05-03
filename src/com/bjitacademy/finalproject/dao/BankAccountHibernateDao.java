package com.bjitacademy.finalproject.dao;



import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.util.UnknownAccountException;



public class BankAccountHibernateDao implements BankAccountDao{
	
	private SessionFactory sessionFactory;
	public BankAccountHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Integer insert(BankAccount bankaccnt) {
		Transaction transaction = null;
		Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			i = (Integer)session.save(bankaccnt);
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
	public void save(BankAccount bankaccnt) {
		Transaction transaction = null;		
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			session.saveOrUpdate(bankaccnt);;
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

	@Override
	public List<BankAccount> getAllSearchBankAccounts(BankAccount bankaccnt) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankAccount.class);
		
		/*if(bankaccnt.getFatherName()!=null && (!bankaccnt.getFatherName().isEmpty())){
			Criterion crit1 = Restrictions.like("firstName", "%"+emp.getFirstName()+"%");
			Criterion crit2 = Restrictions.like("lastName", "%"+emp.getLastName()+"%");
			criteria.add(Restrictions.or(crit1, crit2));
		}*/
		
		if(bankaccnt.getAccountHolderName()!=null && (!bankaccnt.getAccountHolderName().isEmpty())){			
			criteria.add(Restrictions.like("accountHolderName", "%"+bankaccnt.getAccountHolderName()+"%"));
		}
		if(bankaccnt.getFatherName()!=null && (!bankaccnt.getFatherName().isEmpty())){			
			criteria.add(Restrictions.like("fatherName", "%"+bankaccnt.getFatherName()+"%"));
		}
		if(bankaccnt.getMotherName()!=null && (!bankaccnt.getMotherName().isEmpty())){			
			criteria.add(Restrictions.like("motherName", "%"+bankaccnt.getMotherName()+"%"));
		}
		if(bankaccnt.getPermanentAddress()!=null && (!bankaccnt.getPermanentAddress().isEmpty())){			
			criteria.add(Restrictions.like("permanentAddress", "%"+bankaccnt.getPermanentAddress()+"%"));
		}
		if(bankaccnt.getCurrentAddress()!=null && (!bankaccnt.getCurrentAddress().isEmpty())){			
			criteria.add(Restrictions.like("currentAddress", "%"+bankaccnt.getCurrentAddress()+"%"));
		}
		if(bankaccnt.getContactNumber()!=null && (!bankaccnt.getContactNumber().isEmpty())){			
			criteria.add(Restrictions.eq("contactNumber", bankaccnt.getContactNumber()));
		}
		if(bankaccnt.getEmailAddress()!=null && (!bankaccnt.getEmailAddress().isEmpty())){			
			criteria.add(Restrictions.eq("emailAddress", bankaccnt.getEmailAddress()));
		}
		if(bankaccnt.getOccupation()!=null && (!bankaccnt.getOccupation().isEmpty())){			
			criteria.add(Restrictions.eq("occupation", bankaccnt.getOccupation()));
		}
		if(bankaccnt.getNid_pin()!=null && (!bankaccnt.getNid_pin().isEmpty())){			
			criteria.add(Restrictions.eq("nid_pin", bankaccnt.getNid_pin()));
		}
		if(bankaccnt.getYearlyIncome()!=null && (!bankaccnt.getYearlyIncome().equals(0))){			
			criteria.add(Restrictions.ge("nid_pin", bankaccnt.getNid_pin()));
		}		
	
		try {
			 criteria.addOrder(Order.asc("bankAccNumber")).setMaxResults(10);
			 @SuppressWarnings("unchecked")
			 List<BankAccount> blist= criteria.list();
			 return blist;
		} finally {
			transaction.commit();
			session.close();
		}
		
	}

	
	public BankAccount getBankAccount(Integer id) {
		
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			BankAccount bankaccnt=(BankAccount)session.get(BankAccount.class,id);
			return bankaccnt;
		} finally {
			transaction.commit();
			session.close();
		}
	}
	
	public BankAccount getSingleAccount(Integer bankaccntnumber){		
		Transaction transaction = null;
		Session session = null;
		BankAccount bankaccnt = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		System.out.println(bankaccntnumber);
		try {
			Query query = session.createQuery("from BankAccount where bankAccNumber = :bankAccNumber");						
			query.setInteger("bankAccNumber", bankaccntnumber);
			bankaccnt= (BankAccount)query.uniqueResult();			
			
		} catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		} finally {
			transaction.commit();
			session.close();
		}
		
		if (bankaccnt == null) {
			throw new UnknownAccountException(bankaccntnumber);
	        // throw new RuntimeException("Unable to find Account for account number :" + bankaccntnumber);
	    }
		return bankaccnt;
	}
	
	
	public void update(BankAccount bankaccnt) {
		Transaction transaction = null;		
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{			
			session.update(bankaccnt);
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	
	@Override
	public void delete(BankAccount bankaccnt) {
		Transaction transaction = null;		
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{			
			session.delete(bankaccnt);
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
