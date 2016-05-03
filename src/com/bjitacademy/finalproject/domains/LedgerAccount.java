package com.bjitacademy.finalproject.domains;

import java.math.BigDecimal;
import java.util.Date;

public class LedgerAccount {

	
	private Integer ledgerId;
	private Integer bankAccNumber;
	private Date ledgerDate;
	private String refInfo;
	private String description;
	private BigDecimal depositAmount;
	private BigDecimal widrawAmount;
	private BigDecimal interestAmount;
	
	private BankAccountLedger bankAccountledger;	
	public LedgerAccount() {
		super();
	}

	public BankAccountLedger getBankAccountledger() {
		return bankAccountledger;
	}

	public void setBankAccountledger(BankAccountLedger bankAccountledger) {
		this.bankAccountledger = bankAccountledger;
	}

	public Integer getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(Integer ledgerId) {
		this.ledgerId = ledgerId;
	}

	public Integer getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public Date getLedgerDate() {
		return ledgerDate;
	}

	public void setLedgerDate(Date ledgerDate) {
		this.ledgerDate = ledgerDate;
	}

	public String getRefInfo() {
		return refInfo;
	}

	public void setRefInfo(String refInfo) {
		this.refInfo = refInfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public BigDecimal getWidrawAmount() {
		return widrawAmount;
	}

	public void setWidrawAmount(BigDecimal widrawAmount) {
		this.widrawAmount = widrawAmount;
	}

	public BigDecimal getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(BigDecimal interestAmount) {
		this.interestAmount = interestAmount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bankAccNumber == null) ? 0 : bankAccNumber.hashCode());
		result = prime * result
				+ ((depositAmount == null) ? 0 : depositAmount.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((interestAmount == null) ? 0 : interestAmount.hashCode());
		result = prime * result
				+ ((ledgerDate == null) ? 0 : ledgerDate.hashCode());
		result = prime * result
				+ ((ledgerId == null) ? 0 : ledgerId.hashCode());
		result = prime * result + ((refInfo == null) ? 0 : refInfo.hashCode());
		result = prime * result
				+ ((widrawAmount == null) ? 0 : widrawAmount.hashCode());
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
		LedgerAccount other = (LedgerAccount) obj;
		if (bankAccNumber == null) {
			if (other.bankAccNumber != null)
				return false;
		} else if (!bankAccNumber.equals(other.bankAccNumber))
			return false;
		if (depositAmount == null) {
			if (other.depositAmount != null)
				return false;
		} else if (!depositAmount.equals(other.depositAmount))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (interestAmount == null) {
			if (other.interestAmount != null)
				return false;
		} else if (!interestAmount.equals(other.interestAmount))
			return false;
		if (ledgerDate == null) {
			if (other.ledgerDate != null)
				return false;
		} else if (!ledgerDate.equals(other.ledgerDate))
			return false;
		if (ledgerId == null) {
			if (other.ledgerId != null)
				return false;
		} else if (!ledgerId.equals(other.ledgerId))
			return false;
		if (refInfo == null) {
			if (other.refInfo != null)
				return false;
		} else if (!refInfo.equals(other.refInfo))
			return false;
		if (widrawAmount == null) {
			if (other.widrawAmount != null)
				return false;
		} else if (!widrawAmount.equals(other.widrawAmount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LedgerAccount [ledgerId=" + ledgerId + ", bankAccNumber="
				+ bankAccNumber + ", ledgerDate=" + ledgerDate + ", refInfo="
				+ refInfo + ", description=" + description + ", depositAmount="
				+ depositAmount + ", widrawAmount=" + widrawAmount
				+ ", interestAmount=" + interestAmount + ", bankAccountledger="
				+ bankAccountledger + "]";
	}

	
}
