package com.bjitacademy.finalproject.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.AccountTransferHistory;
import com.bjitacademy.finalproject.domains.Beneficiary;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BankService;
import com.opensymphony.xwork2.ActionSupport;


public class ConfirmBalanceTransferAction extends ActionSupport implements SessionAware{

	
	
	Map<String, Object> session;
	private Integer fromAccount;
	private Integer toAccount;	
	private BigDecimal transferAmount;
	private String toAccountHolderName;
	private String remarks;
	
	
	BankService bankService;
	Beneficiary beneficiary;	
	List<Beneficiary> beneficList= new ArrayList<Beneficiary>();
	

	public void setBankService(BankService bankService) {
		this.bankService = bankService;
	}
	
	public Integer getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Integer fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Integer getToAccount() {
		return toAccount;
	}

	public void setToAccount(Integer toAccount) {
		this.toAccount = toAccount;
	}

	public BigDecimal getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(BigDecimal transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getToAccountHolderName() {
		return toAccountHolderName;
	}

	public void setToAccountHolderName(String toAccountHolderName) {
		this.toAccountHolderName = toAccountHolderName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	public List<Beneficiary> getBeneficList() {
		return beneficList;
	}

	/*public void setBeneficList(List<Beneficiary> beneficList) {
		this.beneficList = beneficList;
	}*/
	
	public String execute() throws Exception{
		try{	
			UserAccount userinfo = (UserAccount)session.get("user");
					
			this.beneficList = bankService.getAllBeneficiaries(userinfo.getBankAccNumber());
			AccountTransferHistory accntHistory = new AccountTransferHistory();
			accntHistory.setFromAccount(fromAccount);
			accntHistory.setToAccount(toAccount);
			accntHistory.setActionDate(new Date());
			accntHistory.setRemarks(this.remarks);
			accntHistory.setAmount(transferAmount);
			accntHistory.setTransferType("transfer");
			System.out.println(accntHistory);
			bankService.transfer(fromAccount, toAccount, transferAmount, accntHistory);
			return "success";
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			return "input";
		}	
	}
	
	
	
}
