package com.bjitacademy.finalproject.domains;

import java.io.Serializable;

public class UserAccount implements Serializable{
	
	
	private String LoginId;
	private String Password;
	private String LoginType;
	private Integer bankAccNumber;
	private BankAccount bankaccnt;
	
	public BankAccount getBankaccnt() {
		return bankaccnt;
	}
	public void setBankaccnt(BankAccount bankaccnt) {
		this.bankaccnt = bankaccnt;
	}
	public UserAccount() {
		super();		
	}
	
	public UserAccount( String loginId, String password,
			String loginType) {
		super();
		
		LoginId = loginId;
		Password = password;
		LoginType = loginType;
		
		
	}
	
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLoginType() {
		return LoginType;
	}
	public void setLoginType(String loginType) {
		LoginType = loginType;
	}
	public Integer getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LoginId == null) ? 0 : LoginId.hashCode());
		result = prime * result
				+ ((LoginType == null) ? 0 : LoginType.hashCode());
		result = prime * result
				+ ((Password == null) ? 0 : Password.hashCode());		
		result = prime * result
				+ ((bankAccNumber == null) ? 0 : bankAccNumber.hashCode());
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
		UserAccount other = (UserAccount) obj;
		if (LoginId == null) {
			if (other.LoginId != null)
				return false;
		} else if (!LoginId.equals(other.LoginId))
			return false;
		if (LoginType == null) {
			if (other.LoginType != null)
				return false;
		} else if (!LoginType.equals(other.LoginType))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;		
		if (bankAccNumber == null) {
			if (other.bankAccNumber != null)
				return false;
		} else if (!bankAccNumber.equals(other.bankAccNumber))
			return false;
		return true;
	}
	
	public String toString() {
		return "UserAccount [LoginId="
				+ LoginId + ", Password=" + Password + ", LoginType="
				+ LoginType + ", bankAccNumber=" + bankAccNumber + "]";
	}
	
	
	
}
