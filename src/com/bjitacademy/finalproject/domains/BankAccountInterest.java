package com.bjitacademy.finalproject.domains;

public class BankAccountInterest  extends Account{

	public BankAccountInterest() {
		super();
	}
	
	private InterestRate interestRate;
	

	public InterestRate getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}

}
