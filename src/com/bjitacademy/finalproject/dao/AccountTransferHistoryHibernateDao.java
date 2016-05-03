package com.bjitacademy.finalproject.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.bjitacademy.finalproject.domains.AccountTransferHistory;


public class AccountTransferHistoryHibernateDao implements AccountTransferHistoryDao{

	private SessionFactory sessionFactory;
	public AccountTransferHistoryHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Integer insert(AccountTransferHistory accntHistory) {
		Transaction transaction = null;
		Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			i = (Integer)session.save(accntHistory);
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
	public List<AccountTransferHistory> SearchBalanceTransferHistory(Date from,
			Date to, Integer accntNumber) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(AccountTransferHistory.class);
				
		try {
			if(from!=null && to!=null){
				criteria.add(Restrictions.between("actionDate", from,to));
			}			
			else if(from!=null){
				criteria.add(Restrictions.ge("actionDate", from));
			}
			else if(to!=null){
				criteria.add(Restrictions.le("actionDate", to));
			}
			criteria.addOrder(Order.desc("actionDate"));
			
			 List<AccountTransferHistory> tlist= criteria.list();
			 return tlist;
		} finally {
			transaction.commit();
			session.close();
		}
		
	}	

}
