package com.bjitacademy.finalproject.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bjitacademy.finalproject.domains.LedgerAccount;


public interface LedgerAccountDao {
	
	public Integer insert(LedgerAccount ledgeraccount);
	public List getBankAccountLedger(BigDecimal bankaccntnumber);
	public List<LedgerAccount> getLedgerDetails(BigDecimal bankaccntnumber);
	
}
