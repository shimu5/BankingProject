package com.bjitacademy.finalproject.action;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.LedgerAccountDefaultService;

public class AccountSummaryAction implements SessionAware{
	
	private LedgerAccountDefaultService ledgerserv;
	private BigDecimal bankAccNumber;
	List bankLedgerlist;
	Map<String, Object> session;
	
	public BigDecimal getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(BigDecimal bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public void setLedgerserv(LedgerAccountDefaultService ledgerserv) {
		this.ledgerserv = ledgerserv;
	}	

	
	public List getBankLedgerlist() {
		return bankLedgerlist;
	}

	public void setBankLedgerlist(List bankLedgerlist) {
		this.bankLedgerlist = bankLedgerlist;
	}

	public String execute() throws Exception{
		
		try{
			UserAccount userinfo = (UserAccount)session.get("user");
			bankLedgerlist = this.ledgerserv.getBankAccountLedger(new BigDecimal(userinfo.getBankAccNumber()));		
			
			/*Iterator iter=bankLedgerlist.iterator();
		    while (iter.hasNext()) {
		        Object[] result= (Object[]) iter.next();
		        System.out.println("Vendor Name-->" +result[0]);
		    }*/
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
