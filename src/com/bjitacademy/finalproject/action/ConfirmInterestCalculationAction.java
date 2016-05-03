package com.bjitacademy.finalproject.action;

import java.util.List;

import com.bjitacademy.finalproject.service.InterestCalculateService;

public class ConfirmInterestCalculationAction {
	InterestCalculateService interestCalService;
	List bankIntList;

	public void setInterestCalService(InterestCalculateService interestCalService) {
		this.interestCalService = interestCalService;
	}

	public List getBankIntList() {
		return bankIntList;
	}

	public void setBankIntList(List bankIntList) {
		this.bankIntList = bankIntList;
	}

	public String execute(){		
		try{
			interestCalService.CalculateBankAccountInterst();
			bankIntList =  interestCalService.getAllBankAccountsInterest();
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "failure";
		}

	}

}
