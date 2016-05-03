package com.bjitacademy.finalproject.domains;

import java.util.List;

public class BankAccountBeneficiary extends Account{

	private List<Beneficiary> benefList;
		
	public List<Beneficiary> getBenefList() {
		return benefList;
	}
	public void setBenefList(List<Beneficiary> benefList) {
		this.benefList = benefList;
	}
	public BankAccountBeneficiary() {
		super();
	}
	
	

}
