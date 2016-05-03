package com.bjitacademy.finalproject.action;

import java.math.BigDecimal;
import java.util.Date;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.LedgerAccount;
import com.bjitacademy.finalproject.service.LedgerAccountService;
import com.bjitacademy.finalproject.service.LedgerService;
import com.bjitacademy.finalproject.util.InsufficientFundsException;
import com.bjitacademy.finalproject.util.UnknownAccountException;

public class ConfirmWithdrawAmountAction {

	private LedgerAccount ledgeraccount;
	//private LedgerAccountService ledgerService;	
	private LedgerService ledgerService;
	
	public LedgerAccount getLedgeraccount() {
		return ledgeraccount;
	}

	public void setLedgeraccount(LedgerAccount ledgeraccount) {
		this.ledgeraccount = ledgeraccount;
	}	

	/*public void setLedgerService(LedgerAccountService ledgerService) {
		this.ledgerService = ledgerService;
	}*/
	

	public String execute() throws Exception{
		String msg ="";
		//System.out.println(ledgeraccount.toString());
		try{			
			ledgerService.withdraw(ledgeraccount, ledgeraccount.getWidrawAmount());
			return "success";
		}
		catch (UnknownAccountException e) {
			msg = e.getIdentity().toString();
			return "failure";
		}
		catch (InsufficientFundsException e) {
			msg = e.getRequired().toString();
			return "failure";
		}
		catch(Exception e){
			msg ="DB Insert error";
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}
	}

	public void setLedgerService(LedgerService ledgerService) {
		this.ledgerService = ledgerService;
	}
}
