package com.bjitacademy.finalproject.action;

import java.util.Iterator;
import java.util.List;

import com.bjitacademy.finalproject.domains.BankAccountInterest;
import com.bjitacademy.finalproject.domains.InterestRate;
import com.bjitacademy.finalproject.service.AccountInterestService;


public class CalculateInterestAction {
	
	AccountInterestService interestService;
	List bankInterestList;
	List<BankAccountInterest> bankAccntList;
	//DefaultInterestCalculateService interestService
	//List<Object[]> bankInterestList;

	public CalculateInterestAction() {
		super();
	}

	public void setInterestService(AccountInterestService interestService) {
		this.interestService = interestService;
	}
	
	

	public List getBankInterestList() {
		return bankInterestList;
	}

	public void setBankInterestList(List<InterestRate> bankInterestList) {
		this.bankInterestList = bankInterestList;
	}

	public List<BankAccountInterest> getBankAccntList() {
		return bankAccntList;
	}

	public void setBankAccntList(List<BankAccountInterest> bankAccntList) {
		this.bankAccntList = bankAccntList;
	}

	public String execute(){
		bankInterestList = interestService.getAllBankAccountsInterest();
		System.out.println(bankInterestList.toString());
		
		 for (int i = 0; i < bankInterestList.size(); i++) {
	            System.out.println(((Object[]) bankInterestList.get(i))[0]);     //account bean, actually this is in reverse order - so this is user bean
	            System.out.println(((Object[]) bankInterestList.get(i))[1]);     //user bean         & this account bean
	        }
		System.out.println("--------------------------------------------------------------");
		
		
		
		
		/*System.out.println(bankInterestList.toString());
		Iterator<InterestRate> itr=bankInterestList.iterator();  
	    while(itr.hasNext()){  
	    	InterestRate q=itr.next();  
	        System.out.println("Question Name: "+q.getAnnualInterestRate());  
	          
	        //printing answers  
	        List<BankAccount> list2=q.getBanklist();  
	        Iterator<BankAccount> itr2=list2.iterator();  
	        while(itr2.hasNext()){  
	        	BankAccount bankaccnt = itr2.next();
	        
	            System.out.println(itr2.next());  
	            System.out.println(bankaccnt.getAccountHolderName());  
	        }
	    }*/
		return "success";
	} 
	
}
