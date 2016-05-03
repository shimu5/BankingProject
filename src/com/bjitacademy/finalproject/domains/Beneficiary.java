package com.bjitacademy.finalproject.domains;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class Beneficiary {

	private Integer beneficiaryId;
	private String  aliasName;
	private Integer userBankAccountNumber;
	private Integer bankAccNumber;	
	private String accountHolderName;	
	private String emailId;
	private String mobileNumber;	
	private BigDecimal amount;
	private BankAccountBeneficiary bankAccntBenefic;
	//private Set beneficiarygrp;
	
	public Beneficiary() {
		super();
	}
	
	public BankAccountBeneficiary getBankAccntBenefic() {
		return bankAccntBenefic;
	}

	public void setBankAccntBenefic(BankAccountBeneficiary bankAccntBenefic) {
		this.bankAccntBenefic = bankAccntBenefic;
	}
	
	public Integer getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(Integer beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getAliasName() {
		return aliasName;
	}
	
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	
	public Integer getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	
	public Integer getUserBankAccountNumber() {
		return userBankAccountNumber;
	}

	public void setUserBankAccountNumber(Integer userBankAccountNumber) {
		this.userBankAccountNumber = userBankAccountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	/*public Set<BeneficiaryGroup> getBeneficiarygrp() {
		return beneficiarygrp;
	}

	public void setBeneficiarygrp(Set<BeneficiaryGroup> beneficiarygrp) {
		this.beneficiarygrp = beneficiarygrp;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((accountHolderName == null) ? 0 : accountHolderName
						.hashCode());
		result = prime * result
				+ ((aliasName == null) ? 0 : aliasName.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((bankAccNumber == null) ? 0 : bankAccNumber.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result
				+ ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
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
		Beneficiary other = (Beneficiary) obj;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (aliasName == null) {
			if (other.aliasName != null)
				return false;
		} else if (!aliasName.equals(other.aliasName))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (bankAccNumber == null) {
			if (other.bankAccNumber != null)
				return false;
		} else if (!bankAccNumber.equals(other.bankAccNumber))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Beneficiary [aliasName=" + aliasName + ", bankAccNumber="
				+ bankAccNumber + ", accountHolderName=" + accountHolderName
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", amount=" + amount + "]";
	}

}
