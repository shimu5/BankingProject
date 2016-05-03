package com.bjitacademy.finalproject.domains;

import java.util.List;





public class InterestRate {

	private Integer accountType;
	private Integer annualInterestRate;
	private BankAccountInterest bankAccount;
	private List<BankAccountInterest> banklist;
	 
	public InterestRate() {
		super();
	}

	
	public List<BankAccountInterest> getBanklist() {
		return banklist;
	}


	public void setBanklist(List<BankAccountInterest> banklist) {
		this.banklist = banklist;
	}


	public BankAccountInterest getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccountInterest bankAccount) {
		this.bankAccount = bankAccount;
	}


	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public Integer getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(Integer annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountType == null) ? 0 : accountType.hashCode());
		result = prime
				* result
				+ ((annualInterestRate == null) ? 0 : annualInterestRate
						.hashCode());
		result = prime * result
				+ ((bankAccount == null) ? 0 : bankAccount.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterestRate other = (InterestRate) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (annualInterestRate == null) {
			if (other.annualInterestRate != null)
				return false;
		} else if (!annualInterestRate.equals(other.annualInterestRate))
			return false;
		if (bankAccount == null) {
			if (other.bankAccount != null)
				return false;
		} else if (!bankAccount.equals(other.bankAccount))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "InterestRate [accountType=" + accountType
				+ ", annualInterestRate=" + annualInterestRate
				+ ", bankAccount=" + bankAccount + "]";
	}	
	
	
}
