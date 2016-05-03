package com.bjitacademy.finalproject.service;

import java.math.BigDecimal;
import java.util.List;

import com.bjitacademy.finalproject.dao.LedgerAccountDao;
import com.bjitacademy.finalproject.domains.LedgerAccount;

public class LedgerAccountDefaultService {
	
	LedgerAccountDao ledgerDao;

	public LedgerAccountDefaultService() {
		super();
	}

	public void setLedgerDao(LedgerAccountDao ledgerDao) {
		this.ledgerDao = ledgerDao;
	}
	
	public List getBankAccountLedger(BigDecimal bankaccntnumber){
		return this.ledgerDao.getBankAccountLedger(bankaccntnumber);
	}
	
	public List<LedgerAccount> getLedgerDetails(BigDecimal bankaccntnumber){
		return this.ledgerDao.getLedgerDetails(bankaccntnumber);
	}

}
