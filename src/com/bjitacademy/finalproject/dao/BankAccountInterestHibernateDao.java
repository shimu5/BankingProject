package com.bjitacademy.finalproject.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bjitacademy.finalproject.domains.BankAccountInterest;

public class BankAccountInterestHibernateDao implements BankAccountInterestDao{

	private SessionFactory sessionFactory;
	public BankAccountInterestHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(BankAccountInterest bankaccnt) {
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

}
