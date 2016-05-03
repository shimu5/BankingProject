package com.bjitacademy.finalproject.action;

import java.math.BigDecimal;
import java.util.List;

import com.bjitacademy.finalproject.domains.LedgerAccount;
import com.bjitacademy.finalproject.service.LedgerAccountDefaultService;

public class LedgerAccountDetailAction {
	
	private LedgerAccountDefaultService ledgerserv;
	private BigDecimal bankAccNumber;
	private List bankLedgerlist;
	private List<LedgerAccount> Ledgerlist;
	
	
	public BigDecimal getBankAccNumber() {
		return bankAccNumber;
	}


	public void setBankAccNumber(BigDecimal bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}


	public List getBankLedgerlist() {
		return bankLedgerlist;
	}


	public void setBankLedgerlist(List bankLedgerlist) {
		this.bankLedgerlist = bankLedgerlist;
	}


	public List<LedgerAccount> getLedgerlist() {
		return Ledgerlist;
	}


	public void setLedgerlist(List<LedgerAccount> ledgerlist) {
		Ledgerlist = ledgerlist;
	}


	public void setLedgerserv(LedgerAccountDefaultService ledgerserv) {
		this.ledgerserv = ledgerserv;
	}


	public String execute() throws Exception{

		try{			
			bankLedgerlist = this.ledgerserv.getBankAccountLedger(bankAccNumber);	
			Ledgerlist = this.ledgerserv.getLedgerDetails(bankAccNumber);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}

	}

}
