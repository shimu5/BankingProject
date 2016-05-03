package com.bjitacademy.finalproject.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class InterestRateHibernateDao implements InterestRateDao{

	private SessionFactory sessionFactory;
	public InterestRateHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List getAllBankAccountsInterest() {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			//List<InterestRate> listResult  = session.createQuery("from InterestRate i inner join i.bankAccount ").list();
			//List<InterestRate> listResult  = (List<InterestRate>)
			return session.createQuery(" from InterestRate ir inner join ir.banklist") 					
                     .list();
			 //return listResult;
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

	
}
