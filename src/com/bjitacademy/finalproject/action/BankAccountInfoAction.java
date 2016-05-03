package com.bjitacademy.finalproject.action;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.service.BankAccountService;

public class BankAccountInfoAction {
	
	public BankAccountService accountService;
	public Integer bankAccNumber;
	public BankAccount bankaccount;
	
	public BankAccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(BankAccountService accountService) {
		this.accountService = accountService;
	}

	public Integer getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public String execute() throws Exception{			
		try{		
			
			this.bankaccount = (BankAccount)accountService.getBankAccount(this.bankAccNumber);
			System.out.println(this.bankaccount);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}

	}

}
