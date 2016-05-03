package com.bjitacademy.finalproject.domains;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.bjitacademy.finalproject.util.InsufficientFundsException;

abstract class Account implements Serializable{
	
	private Integer bankAccNumber;
	private Integer bankAccountType;
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
	private BigDecimal yearlyIncome;
	private BigDecimal balance;
	private String activeStatus;
	private UserAccount userAccount;
	private String username;
	private String password;
	
	
	/*public BankAccount() {
		super();
	}
	
	public InterestRate getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}*/

	public Integer getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public Integer getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(Integer bankAccountType) {
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

	

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(BigDecimal yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
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

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public String getNid_pin() {
		return nid_pin;
	}

	public void setNid_pin(String nid_pin) {
		this.nid_pin = nid_pin;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((accountHolderName == null) ? 0 : accountHolderName
						.hashCode());
		result = prime * result
				+ ((activeStatus == null) ? 0 : activeStatus.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result
				+ ((bankAccNumber == null) ? 0 : bankAccNumber.hashCode());
		result = prime * result
				+ ((bankAccountType == null) ? 0 : bankAccountType.hashCode());
		result = prime * result
				+ ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result
				+ ((currentAddress == null) ? 0 : currentAddress.hashCode());
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result + ((nid_pin == null) ? 0 : nid_pin.hashCode());
		result = prime * result
				+ ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime
				* result
				+ ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		result = prime * result
				+ ((userAccount == null) ? 0 : userAccount.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		result = prime * result
				+ ((yearlyIncome == null) ? 0 : yearlyIncome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (activeStatus == null) {
			if (other.activeStatus != null)
				return false;
		} else if (!activeStatus.equals(other.activeStatus))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (bankAccNumber == null) {
			if (other.bankAccNumber != null)
				return false;
		} else if (!bankAccNumber.equals(other.bankAccNumber))
			return false;
		if (bankAccountType == null) {
			if (other.bankAccountType != null)
				return false;
		} else if (!bankAccountType.equals(other.bankAccountType))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (currentAddress == null) {
			if (other.currentAddress != null)
				return false;
		} else if (!currentAddress.equals(other.currentAddress))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (nid_pin == null) {
			if (other.nid_pin != null)
				return false;
		} else if (!nid_pin.equals(other.nid_pin))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		if (userAccount == null) {
			if (other.userAccount != null)
				return false;
		} else if (!userAccount.equals(other.userAccount))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (yearlyIncome == null) {
			if (other.yearlyIncome != null)
				return false;
		} else if (!yearlyIncome.equals(other.yearlyIncome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccNumber="
				+ bankAccNumber + ", bankAccountType=" + bankAccountType
				+ ", accountHolderName=" + accountHolderName + ", fatherName="
				+ fatherName + ", motherName=" + motherName
				+ ", permanentAddress=" + permanentAddress
				+ ", currentAddress=" + currentAddress + ", contactNumber="
				+ contactNumber + ", emailAddress=" + emailAddress
				+ ", occupation=" + occupation + ", nid_pin=" + nid_pin
				+ ", currency=" + currency + ", yearlyIncome=" + yearlyIncome
				+ ", balance=" + balance + ", activeStatus=" + activeStatus
				+ ", userAccount=" + userAccount + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	public void debitBalance(BigDecimal amount) {
		if (this.balance.compareTo(amount) < 0) {
			throw new InsufficientFundsException(amount);
		}
		this.balance = this.balance.subtract(amount);
	}

	public void creditBalance(BigDecimal amount) {
		this.balance = this.balance.add(amount);
	}
	
}

public class BankAccount  extends Account{

}

