package com.bjitacademy.finalproject.domains;

import java.util.List;

public class BankAccountLedger extends Account{
	
	private List<LedgerAccount> accountledgers;

	public List<LedgerAccount> getAccountledgers() {
		return accountledgers;
	}

	public void setAccountledgers(List<LedgerAccount> accountledgers) {
		this.accountledgers = accountledgers;
	}

	public BankAccountLedger() {
		super();
	}

}
