package com.bjitacademy.finalproject.action;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BankAccountService;

public class SuccessModifyingAccountAction {
	
	private BankAccountService accountService;
	private BankAccount bankaccount;
	//private UserAccount useraccount;
	private int bankAccNumber;

	public SuccessModifyingAccountAction() {
		super();
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

	
	public int getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(int bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	
	public String execute() throws Exception{
		try{
			System.out.println(bankaccount.toString());
			/*useraccount.setLoginId(bankaccount.getUsername());
			useraccount.setPassword(bankaccount.getPassword());
			bankaccount.setUserAccount(useraccount);
			useraccount.setBankaccnt(bankaccount);
			accountService.update(bankaccount);*/
			
			
			BankAccount bankaccnt = accountService.getBankAccount(bankaccount.getBankAccNumber());
			System.out.println(bankaccnt.toString());
			bankaccnt.setPermanentAddress(bankaccount.getPermanentAddress());
			bankaccnt.setCurrentAddress(bankaccount.getCurrentAddress());
			bankaccnt.setContactNumber(bankaccount.getContactNumber());
			bankaccnt.setEmailAddress(bankaccount.getEmailAddress());
			bankaccnt.setOccupation(bankaccount.getOccupation());
			bankaccnt.setYearlyIncome(bankaccount.getYearlyIncome());
			
			
			UserAccount userAccnt = bankaccnt.getUserAccount();
			System.out.println(userAccnt.toString());
			
			userAccnt.setPassword(bankaccount.getPassword());	
			bankaccnt.setUserAccount(userAccnt);
			userAccnt.setBankaccnt(bankaccnt);
			accountService.update(bankaccnt);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}
	}

}
