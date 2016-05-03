package com.bjitacademy.finalproject.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.Beneficiary;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BeneficiaryService;
import com.opensymphony.xwork2.ActionSupport;

public class BeneficiaryListAction extends ActionSupport implements SessionAware{

	private BeneficiaryService beneficiaryService;
	private Beneficiary beneficiary;
	private Integer bankAccNumber;
	private List<Beneficiary> beneficList;
	private Map<String, Object> session;
	
	private Integer beneficiaryId;
	 

	
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
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	
	
	public Integer getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(Integer beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String execute() throws Exception{
		try{			

			UserAccount userinfo = (UserAccount)session.get("user");
			if(userinfo.getBankAccNumber().equals(this.bankAccNumber)){
				this.beneficList = beneficiaryService.getAllBeneficiaries(bankAccNumber);				
			}
			return "success";
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}	
	}
	
	public String removeBeneficiary() throws Exception{
		try{			

			Beneficiary benefic = beneficiaryService.getBeneficiary(beneficiaryId);
			beneficiaryService.delete(benefic);
			return "success";
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}	
	}

}
