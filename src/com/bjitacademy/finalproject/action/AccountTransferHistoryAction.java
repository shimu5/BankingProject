package com.bjitacademy.finalproject.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.AccountTransferHistory;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.TransferHistoryService;

public class AccountTransferHistoryAction implements SessionAware {

	TransferHistoryService transHistoryService;
	List<AccountTransferHistory> transHistoryList;
	Map<String, Object> session;
	Date fromDate;
	Date toDate;
	
	public void setTransHistoryService(TransferHistoryService transHistoryService) {
		this.transHistoryService = transHistoryService;
	}
	
	public List<AccountTransferHistory> getTransHistoryList() {
		return transHistoryList;
	}

	public void setTransHistoryList(List<AccountTransferHistory> transHistoryList) {
		this.transHistoryList = transHistoryList;
	}
	
	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String execute() throws Exception{
		try{
			UserAccount userinfo = (UserAccount)session.get("user");			
			transHistoryList = this.transHistoryService.SearchBalanceTransferHistory(fromDate, toDate ,userinfo.getBankAccNumber());
			return "success";
		}catch(Exception e){
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
