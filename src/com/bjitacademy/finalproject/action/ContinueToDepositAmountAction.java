package com.bjitacademy.finalproject.action;

import com.bjitacademy.finalproject.domains.LedgerAccount;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ContinueToDepositAmountAction extends ActionSupport implements ModelDriven<LedgerAccount>{

	private LedgerAccount ledgeraccount = new LedgerAccount();
	public ContinueToDepositAmountAction() {
		super();
	}	
	
	@Override
	public LedgerAccount getModel() {		
		return ledgeraccount;
	}
	
	public LedgerAccount getLedgeraccount() {
		return ledgeraccount;
	}
	
	public void setLedgeraccount(LedgerAccount ledgeraccount) {
		this.ledgeraccount = ledgeraccount;
	}

	public String execute() throws Exception{
		return "success";
	}
	
}
