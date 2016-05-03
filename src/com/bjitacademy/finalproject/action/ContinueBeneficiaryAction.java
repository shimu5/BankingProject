package com.bjitacademy.finalproject.action;

import java.math.BigDecimal;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.Beneficiary;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BankAccountService;
import com.bjitacademy.finalproject.util.UnknownAccountException;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ContinueBeneficiaryAction extends ActionSupport implements SessionAware,ModelDriven<Beneficiary> {

	private BankAccountService accountService;
	private Beneficiary beneficiary = new Beneficiary();
	Map<String, Object> session;
	BigDecimal amount;
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setAccountService(BankAccountService accountService) {
		this.accountService = accountService;
	}
	public Beneficiary getModel() {		
		return beneficiary;
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

	public String execute() throws Exception {	
		UserAccount userinfo = (UserAccount)session.get("user");
		try{

			if(!userinfo.getBankAccNumber().equals(beneficiary.getBankAccNumber())){

				BankAccount bankaccount = accountService.getSingleAccount(beneficiary.getBankAccNumber());
				this.beneficiary.setAccountHolderName(bankaccount.getAccountHolderName());	
				return "success";

			}else{
				addFieldError("beneficiary.bankAccNumber","Self Account no. couldn't be use.");
				return "input";
			}

		}catch(UnknownAccountException e){
			String msg = e.getIdentity().toString();
			addActionError("Uknown Account Number : " + msg);
			return "input";
		}

	}

	/*public void validate(){
		if(beneficiary.getBankAccNumber().equals("")){
			addFieldError("beneficiary.bankAccNumber","Bank Account Number required!");
		}
		if(beneficiary.getAliasName().equals("")){
			addFieldError("beneficiary.aliasName","Bank Account Number required!");
		}
	}*/
}
