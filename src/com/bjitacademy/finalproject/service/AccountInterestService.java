package com.bjitacademy.finalproject.service;

import java.util.List;

import com.bjitacademy.finalproject.dao.InterestRateDao;

public class AccountInterestService {

	private InterestRateDao interestDao;
	public AccountInterestService() {
		super();
	}
	public void setInterestDao(InterestRateDao interestDao) {
		this.interestDao = interestDao;
	}
	
	public List getAllBankAccountsInterest(){
		return interestDao.getAllBankAccountsInterest();
	}
	

}
