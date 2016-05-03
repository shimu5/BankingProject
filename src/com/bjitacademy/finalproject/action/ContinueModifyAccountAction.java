package com.bjitacademy.finalproject.action;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ContinueModifyAccountAction extends ActionSupport implements ModelDriven<BankAccount>{

	public ContinueModifyAccountAction() {
		super();
	}
	
	private BankAccount bankaccount = new BankAccount();
	
	public BankAccount getModel() {
	    return bankaccount;
	}
	
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}


	public String execute() throws Exception{		
		return "success";
	}

}
