package com.bjitacademy.finalproject.service;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.bjitacademy.finalproject.dao.AccountTransferHistoryDao;
import com.bjitacademy.finalproject.dao.BankAccountDao;
import com.bjitacademy.finalproject.dao.BeneficiaryDao;
import com.bjitacademy.finalproject.dao.LedgerAccountDao;
import com.bjitacademy.finalproject.domains.AccountTransferHistory;
import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.Beneficiary;
import com.bjitacademy.finalproject.domains.LedgerAccount;
import com.bjitacademy.finalproject.util.UnknownAccountException;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ProgrammaticTxBankService implements BankService {

	private BankAccountDao accountDao;
	private AccountTransferHistoryDao transHistoryDao;
	private LedgerAccountDao ledgerDao;
	BeneficiaryDao beneficiaryDao;
	
	public void setAccountDao(BankAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void setTransHistoryDao(AccountTransferHistoryDao transHistoryDao) {
		this.transHistoryDao = transHistoryDao;
	}
	
	public void setLedgerDao(LedgerAccountDao ledgerDao) {
		this.ledgerDao = ledgerDao;
	}
	

	public void setBeneficiaryDao(BeneficiaryDao beneficiaryDao) {
		this.beneficiaryDao = beneficiaryDao;
	}
	
	public List<Beneficiary> getAllBeneficiaries(Integer bankAccountNumber ){
		return beneficiaryDao.getAllBeneficiaries(bankAccountNumber);
	}


	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager  transactionManager){
		this.transactionManager = transactionManager;
	}

	public void transfer(Integer from, Integer to,
			BigDecimal amount, AccountTransferHistory accntHistory) throws Exception {

		if (getBalance(to).compareTo(new BigDecimal("1000000000")) > 0) {
			throw new RuntimeException("Billionaires do not need more money!");
		}

		BankAccount fromAccount = accountDao.getBankAccount(from);
		if (fromAccount == null)
			throw new UnknownAccountException(from);
		BankAccount toAccount = accountDao.getBankAccount(to);
		if (toAccount == null)
			throw new UnknownAccountException(to);


		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED
				);
		transactionDefinition.setIsolationLevel(DefaultTransactionDefinition.ISOLATION_READ_COMMITTED);
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		
		try{
			fromAccount.debitBalance(amount);
			toAccount.creditBalance(amount);
			accountDao.save(fromAccount);
			accountDao.save(toAccount);
			int i = 0 ; 
			i = transHistoryDao.insert(accntHistory);
			
			LedgerAccount ledgeraccount1 = new LedgerAccount();
			ledgeraccount1.setBankAccNumber(from);
			ledgeraccount1.setWidrawAmount(amount);
			ledgeraccount1.setDescription("Transfer into account: "+to+ ", withdraw : ");
			ledgeraccount1.setLedgerDate(new Date());
			ledgeraccount1.setRefInfo("refId"+i);
			ledgerDao.insert(ledgeraccount1);
			
			LedgerAccount ledgeraccount2 = new LedgerAccount();
			ledgeraccount2.setBankAccNumber(to);
			ledgeraccount2.setDepositAmount(amount);
			ledgeraccount2.setDescription("From Account : "+from +", Balance deposit :");
			ledgeraccount2.setLedgerDate(new Date());
			ledgeraccount2.setRefInfo("refId"+i);
			ledgerDao.insert(ledgeraccount2);
						
			transactionManager.commit(transactionStatus);
		}catch(Exception t){
			transactionManager.rollback(transactionStatus);
			throw t;
		}

	}

	public BigDecimal getBalance(Integer accntnumber) {
		BankAccount account = accountDao.getBankAccount(accntnumber);
		if (account == null)
			throw new UnknownAccountException(accntnumber);
		return account.getBalance();
	}

	

}
