package com.bjitacademy.finalproject.action;

import java.util.ArrayList;
import java.util.List;

import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.model.AccountType;
import com.bjitacademy.finalproject.model.Country;
import com.bjitacademy.finalproject.model.StatusType;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ContinueCreateAccountAction extends ActionSupport implements ModelDriven<BankAccount> {

	public ContinueCreateAccountAction() {
		super();
	}
	
	private int bankAccountType;
	private String accountHolderName;
	private String fatherName;
	private String motherName;
	private String permanentAddress;
	private String currentAddress;
	private String contactNumber;
	private String emailAddress;
	private String occupation;
	private String nid_pin;
	private String currency;
	private double yearlyIncome;
	private double balance;
	private String username;
	private String password;
	
	private BankAccount bankaccount = new BankAccount();
	
	public BankAccount getModel() {
	    return bankaccount;
	}
	
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}


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


	public int getBankAccountType() {
		return bankAccountType;
	}


	public void setBankAccountType(int bankAccountType) {
		this.bankAccountType = bankAccountType;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getPermanentAddress() {
		return permanentAddress;
	}


	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	public String getCurrentAddress() {
		return currentAddress;
	}


	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getNid_pin() {
		return nid_pin;
	}


	public void setNid_pin(String nid_pin) {
		this.nid_pin = nid_pin;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public double getYearlyIncome() {
		return yearlyIncome;
	}


	public void setYearlyIncome(double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
