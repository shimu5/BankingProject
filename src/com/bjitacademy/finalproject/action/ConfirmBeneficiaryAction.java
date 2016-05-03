package com.bjitacademy.finalproject.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.Beneficiary;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BeneficiaryService;

public class ConfirmBeneficiaryAction implements SessionAware{

	BeneficiaryService beneficiaryService;
	Beneficiary beneficiary;
	Map<String, Object> session;
	
	public void setBeneficiaryService(BeneficiaryService beneficiaryService) {
		this.beneficiaryService = beneficiaryService;
	}
	
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String execute() throws Exception{
		try{	
			UserAccount userinfo = (UserAccount)session.get("user");
			
			System.out.println(beneficiary.toString());
			beneficiary.setUserBankAccountNumber(userinfo.getBankAccNumber());
			int i = beneficiaryService.insert(beneficiary);
			System.out.println(i);			
			return "success";
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}	
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
