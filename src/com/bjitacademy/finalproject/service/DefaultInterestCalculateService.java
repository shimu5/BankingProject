package com.bjitacademy.finalproject.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bjitacademy.finalproject.dao.BankAccountDao;
import com.bjitacademy.finalproject.dao.BankAccountInterestDao;
import com.bjitacademy.finalproject.dao.InterestRateDao;
import com.bjitacademy.finalproject.dao.LedgerAccountDao;
import com.bjitacademy.finalproject.domains.BankAccountInterest;
import com.bjitacademy.finalproject.domains.InterestRate;
import com.bjitacademy.finalproject.domains.LedgerAccount;

public class DefaultInterestCalculateService implements InterestCalculateService {

	private InterestRateDao interestDao;
	private LedgerAccountDao ledgerDao;
	private BankAccountInterestDao accountInterstDao;
	public DefaultInterestCalculateService() {
		super();
	}
	public void setInterestDao(InterestRateDao interestDao) {
		this.interestDao = interestDao;
	}
	public void setLedgerDao(LedgerAccountDao ledgerDao) {
		this.ledgerDao = ledgerDao;
	}
	@Override
	public List getAllBankAccountsInterest() {
		return interestDao.getAllBankAccountsInterest();
	}	
	
	
	public void setAccountInterstDao(BankAccountInterestDao accountInterstDao) {
		this.accountInterstDao = accountInterstDao;
	}
	
	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager  transactionManager){
		this.transactionManager = transactionManager;
	}
	
	
	public void CalculateBankAccountInterst() {
		List bankInterestList = interestDao.getAllBankAccountsInterest();
		
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED
				);
		transactionDefinition.setIsolationLevel(DefaultTransactionDefinition.ISOLATION_READ_COMMITTED);
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		
		try{
			Iterator itlst =  bankInterestList.iterator();
			System.out.println("Your Interest going to be started.");
			while ( itlst.hasNext() ) {
			    Object[] tuple = (Object[]) itlst.next();
			   
			    InterestRate intRate  = (InterestRate) tuple[0];
			    BankAccountInterest bankaccntInt = (BankAccountInterest) tuple[1];	
			  
			    //System.out.println(intRate.toString());
			    //System.out.println(bankaccntInt.toString());
			    double interst = (double)intRate.getAnnualInterestRate()/(double)100;
			    
			    BigDecimal balance = bankaccntInt.getBalance().multiply(new BigDecimal(interst));
			    balance = balance.setScale(2, RoundingMode.CEILING);
			    bankaccntInt.creditBalance(balance);
				this.accountInterstDao.save(bankaccntInt);;	
				LedgerAccount ledgeraccount = new LedgerAccount();
				ledgeraccount.setLedgerDate(new Date());
				ledgeraccount.setBankAccNumber(bankaccntInt.getBankAccNumber());
				ledgeraccount.setDescription("Interest");
				ledgeraccount.setInterestAmount(balance);
				ledgeraccount.setRefInfo("Interest - "+new Date());
				//System.out.println(ledgeraccount.toString());
				this.ledgerDao.insert(ledgeraccount);
			
			}
			System.out.println("Your Interest has been completed.");
			transactionManager.commit(transactionStatus);
		}catch(Exception t){
			transactionManager.rollback(transactionStatus);
			throw t;
		}
		
	}
	
	

}
