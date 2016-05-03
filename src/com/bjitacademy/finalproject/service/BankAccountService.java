package com.bjitacademy.finalproject.service;

import java.math.BigDecimal;
import java.util.List;



import com.bjitacademy.finalproject.dao.BankAccountDao;
import com.bjitacademy.finalproject.domains.BankAccount;

public class BankAccountService {

	BankAccountDao dao;	

	public void setDao(BankAccountDao dao) {
		this.dao = dao;
	}
	
	public Integer insert(BankAccount bankaccnt){
		return dao.insert(bankaccnt);
	}
	
	public List<BankAccount> getAllSearchBankAccounts(BankAccount bankaccnt){
		return dao.getAllSearchBankAccounts(bankaccnt);
	}
	
	public BankAccount getBankAccount(Integer id){
		return dao.getBankAccount(id);
	}
	
	public void update(BankAccount bankaccnt){
		dao.update(bankaccnt);
	}

	public void delete(BankAccount bankaccnt) {
		dao.delete(bankaccnt);		
	}
	
	public BankAccount getSingleAccount(Integer bankaccntnumber){		
		return dao.getSingleAccount(bankaccntnumber);
	}
	
}
