package com.bjitacademy.finalproject.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.Beneficiary;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BeneficiaryService;

public class CreateBeneficiaryGroupAction implements SessionAware {

	BeneficiaryService beneficiaryService;
	Beneficiary beneficiary;
	Integer bankAccNumber;
	List<Beneficiary> beneficList;
	Map<String, Object> session;
	
	public BeneficiaryService getBeneficiaryService() {
		return beneficiaryService;
	}
	public void setBeneficiaryService(BeneficiaryService beneficiaryService) {
		this.beneficiaryService = beneficiaryService;
	}
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	public Integer getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	public List<Beneficiary> getBeneficList() {
		return beneficList;
	}
	public void setBeneficList(List<Beneficiary> beneficList) {
		this.beneficList = beneficList;
	}
	
	public String execute() throws Exception{
		try{			
			UserAccount userinfo = (UserAccount)session.get("user");
			this.beneficList = beneficiaryService.getAllBeneficiaries(userinfo.getBankAccNumber());		
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
