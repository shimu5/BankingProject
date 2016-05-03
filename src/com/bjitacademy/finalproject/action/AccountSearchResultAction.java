package com.bjitacademy.finalproject.action;


import java.util.List;
import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.service.BankAccountService;

public class AccountSearchResultAction{

	private BankAccountService accountService;	
	List<BankAccount> accountList;
	private BankAccount bankaccount ;
	
	public BankAccount getModel() {
	    return bankaccount;
	}
	
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}


	public BankAccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(BankAccountService accountService) {
		this.accountService = accountService;
	}

	public List<BankAccount> getAccountList() {
		return accountList;
	}

	public String execute() throws Exception{

		System.out.println(bankaccount.toString());
		try{
			accountList = accountService.getAllSearchBankAccounts(bankaccount);
			System.out.println(accountList.toString());
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}
		
	}

}
