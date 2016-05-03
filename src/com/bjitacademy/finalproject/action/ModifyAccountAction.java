package com.bjitacademy.finalproject.action;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BankAccountService;

public class ModifyAccountAction {
	private BankAccountService accountService;
	private BankAccount bankaccount;
	private int bankAccNumber;
	
	

	public int getBankAccNumber() {
		return bankAccNumber;
	}


	public void setBankAccNumber(int bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}


	public BankAccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(BankAccountService accountService) {
		this.accountService = accountService;
	}


	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public String execute() throws Exception{
		try{
			
			bankaccount = accountService.getBankAccount(getBankAccNumber());

			UserAccount userAccount = bankaccount.getUserAccount();
		
			bankaccount.setUsername(userAccount.getLoginId());
			bankaccount.setPassword(userAccount.getPassword());	
			System.out.println(bankaccount.getPassword());
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}
	}
	
	public String executeDelete() throws Exception{
		try{			
			BankAccount bankaccnt = accountService.getBankAccount(getBankAccNumber());			
			accountService.delete(bankaccnt);			
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}
	}


}
