package com.bjitacademy.finalproject.service;

import java.math.BigDecimal;
import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.LedgerAccount;

public interface LedgerService {

	void withdraw(LedgerAccount ledgeraccount, BigDecimal balance);
	void deposit(LedgerAccount ledgeraccount, BigDecimal balance);

}
