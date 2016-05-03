package com.bjitacademy.finalproject.action;

import java.util.ArrayList;
import java.util.List;

import com.bjitacademy.finalproject.model.AccountType;
import com.bjitacademy.finalproject.model.Country;
import com.bjitacademy.finalproject.model.StatusType;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author Shimu
 *
 */
public class CreateAccountAction  {
	
	
	public String execute() throws Exception{		
		return "SUCCESS";
	}
	
	public List<AccountType> getAccountTypes(){
		List<AccountType> accountTypes = new ArrayList<AccountType>();
		accountTypes.add(new AccountType(1, "Savings"));	
		accountTypes.add(new AccountType(2, "Current"));
		accountTypes.add(new AccountType(3, "Super Saver"));
		return accountTypes;
	}
	public List<StatusType> getStatus(){
		List<StatusType> statusTypes = new ArrayList<StatusType>();
		statusTypes.add(new StatusType(1, "Active"));
		statusTypes.add(new StatusType(2, "Inactive"));		
		return statusTypes;
	}

	public List<Country> getCurrencies(){
		List<Country> currencyList = new ArrayList<Country>();
		currencyList.add(new Country("USD","USD Dollar"));
		currencyList.add(new Country("KYT","USD Dollar"));
		return currencyList;
	}

	
	
}
