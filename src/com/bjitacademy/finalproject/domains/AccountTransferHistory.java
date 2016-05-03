package com.bjitacademy.finalproject.domains;

import java.math.BigDecimal;
import java.util.Date;

public class AccountTransferHistory {

	private Integer transferId;
	private Integer fromAccount;
	private Integer toAccount;
	private Date actionDate;	
	private String transferType;
	private String remarks;
	private BigDecimal amount;
	
	
	public Integer getTransferId() {
		return transferId;
	}
	public void setTransferId(Integer transferId) {
		this.transferId = transferId;
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
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actionDate == null) ? 0 : actionDate.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((fromAccount == null) ? 0 : fromAccount.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result
				+ ((toAccount == null) ? 0 : toAccount.hashCode());
		result = prime * result
				+ ((transferId == null) ? 0 : transferId.hashCode());
		result = prime * result
				+ ((transferType == null) ? 0 : transferType.hashCode());
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
		AccountTransferHistory other = (AccountTransferHistory) obj;
		if (actionDate == null) {
			if (other.actionDate != null)
				return false;
		} else if (!actionDate.equals(other.actionDate))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (fromAccount == null) {
			if (other.fromAccount != null)
				return false;
		} else if (!fromAccount.equals(other.fromAccount))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (toAccount == null) {
			if (other.toAccount != null)
				return false;
		} else if (!toAccount.equals(other.toAccount))
			return false;
		if (transferId == null) {
			if (other.transferId != null)
				return false;
		} else if (!transferId.equals(other.transferId))
			return false;
		if (transferType == null) {
			if (other.transferType != null)
				return false;
		} else if (!transferType.equals(other.transferType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AccountTransferHistory [transferId=" + transferId
				+ ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", actionDate=" + actionDate + ", transferType="
				+ transferType + ", remarks=" + remarks + ", amount=" + amount
				+ "]";
	}
	
	
	
}
