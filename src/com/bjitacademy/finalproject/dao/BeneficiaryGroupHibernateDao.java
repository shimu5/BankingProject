package com.bjitacademy.finalproject.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bjitacademy.finalproject.domains.BeneficiaryGroup;

public class BeneficiaryGroupHibernateDao implements BeneficiaryGroupDao{
	
	private SessionFactory sessionFactory;
	public BeneficiaryGroupHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Integer insert(String groupName, List<String> aliasNames){
		Transaction transaction = null;
		Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			int bsize = aliasNames.size();
			
			for(int j=0;j<=bsize;j++){
				BeneficiaryGroup bgrp= new BeneficiaryGroup();
				bgrp.setGroupName(groupName); 
				bgrp.setAliasName(aliasNames.get(j));
				System.out.println(bgrp.toString());
				i = (Integer)session.save(bgrp);
			}
			
			
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
	public List<BeneficiaryGroup> getAllBeneficiaryGroup(Integer bankaccntNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
