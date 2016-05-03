package com.bjitacademy.finalproject.service;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bjitacademy.finalproject.dao.BankAccountDao;
import com.bjitacademy.finalproject.dao.InterestRateDao;
import com.bjitacademy.finalproject.dao.LedgerAccountDao;
import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.LedgerAccount;
import com.bjitacademy.finalproject.util.UnknownAccountException;

public class LedgerAccountService implements LedgerService{

	LedgerAccountDao ledgerDao;	
	BankAccountDao accountDao;

	
	public void setLedgerDao(LedgerAccountDao ledgerDao) {
		this.ledgerDao = ledgerDao;
	}

	public void setAccountDao(BankAccountDao accountDao) {
		this.accountDao = accountDao;
	}	

	public Integer insert(LedgerAccount ledgeraccount){
		return ledgerDao.insert(ledgeraccount);
	}	
	
	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager  transactionManager){
		this.transactionManager = transactionManager;
	}
	
	@Override
	public void withdraw(LedgerAccount ledgeraccount,
			BigDecimal balance) {
		 
		BankAccount bankaccnt = accountDao.getBankAccount(ledgeraccount.getBankAccNumber());
		if(bankaccnt==null){
			throw new UnknownAccountException(ledgeraccount.getBankAccNumber());			
		}
		
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED
				);
		transactionDefinition.setIsolationLevel(DefaultTransactionDefinition.ISOLATION_READ_COMMITTED);
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		
		try{		
			System.out.println("Your withdraw going to be started.");
			bankaccnt.debitBalance(balance);
			this.accountDao.save(bankaccnt);	
			ledgeraccount.setLedgerDate(new Date());
			this.ledgerDao.insert(ledgeraccount);
			System.out.println("Your withdraw has been completed.");
			transactionManager.commit(transactionStatus);
		}catch(Exception t){
			transactionManager.rollback(transactionStatus);
			throw t;
		}
		
	}

	@Override
	public void deposit(LedgerAccount ledgeraccount, BigDecimal balance) {
		BankAccount bankaccnt = accountDao.getBankAccount(ledgeraccount.getBankAccNumber());
		if(bankaccnt==null){
			throw new UnknownAccountException(ledgeraccount.getBankAccNumber());			
		}
		
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED
				);
		transactionDefinition.setIsolationLevel(DefaultTransactionDefinition.ISOLATION_READ_COMMITTED);
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		try{		
			System.out.println("Your Deposit going to be started.");
			bankaccnt.creditBalance(balance);
			this.accountDao.save(bankaccnt);	
			ledgeraccount.setLedgerDate(new Date());
			this.ledgerDao.insert(ledgeraccount);
			System.out.println("Your Deposit has been completed.");
		}catch(Exception t){
			transactionManager.rollback(transactionStatus);
			throw t;
		}
	}
	
	
}
