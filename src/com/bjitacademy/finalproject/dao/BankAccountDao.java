package com.bjitacademy.finalproject.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bjitacademy.finalproject.domains.BankAccount;



public interface BankAccountDao {

	public Integer insert(BankAccount bankaccnt);
	public void save(BankAccount bankaccnt);
	public List<BankAccount> getAllSearchBankAccounts(BankAccount bankaccnt);
	public BankAccount getBankAccount(Integer id);
	public void delete(BankAccount bankaccnt);
	public void update(BankAccount bankaccnt);
	public BankAccount getSingleAccount(Integer bankaccntnumber);

}
