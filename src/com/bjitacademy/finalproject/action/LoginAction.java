package com.bjitacademy.finalproject.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;

import com.bjitacademy.finalproject.dao.BankAccountDao;
import com.bjitacademy.finalproject.dao.UserAuthDao;
import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{

	
	private String username;
	private String password;
	private String loginType;
	
	UserAuthDao userAuthDao;
	BankAccountDao bankAccountDao;
	
	private Map<String,Object> sessionAttributes = null;
	
	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public void setUserAuthDao(UserAuthDao userAuthDao) {
		this.userAuthDao = userAuthDao;
	}	

	public void setBankAccountDao(BankAccountDao bankAccountDao) {
		this.bankAccountDao = bankAccountDao;
	}

	//business logic
	public String execute() throws Exception{
		System.out.println(this.username);
		UserAccount searchaccnt  = new UserAccount();
		searchaccnt.setLoginId(this.username);
		
		try{
			UserAccount userinfo =  userAuthDao.UserAccountInfo(searchaccnt);
			
			System.out.println(userinfo.getBankAccNumber());
			
			BankAccount bankaccount = bankAccountDao.getBankAccount(userinfo.getBankAccNumber());
			
			if(userinfo.getLoginId().equals(this.username) && userinfo.getPassword().equals(this.password)
					&& userinfo.getLoginType().equals(this.loginType)
					){
						
				sessionAttributes.put("user", userinfo);
				sessionAttributes.put("bankinfo", bankaccount);
				if(userinfo.getLoginType().equals("AccountHolder")){			
					return "UserHome"; 
				}
				else{				
					return "AdminHome";
				}				
			}
			if(userinfo.getLoginId().equals(this.username) && !userinfo.getPassword().equals(this.password)){
				addFieldError("password","Password not match!");				
				return "LoginFailure";
			}
			if(userinfo.getLoginId().equals(this.username) && userinfo.getPassword().equals(this.password) && !userinfo.getLoginType().equals(this.loginType)){
				addFieldError("username","Username & Password not match!");				
				return "LoginFailure";
			}
			else{
				addActionError("Username & Password not match!");				
				return "LoginFailure";
			}
		}catch(Exception e){
			e.printStackTrace();			
			return "LoginFailure";			
		}			
	}
	
	public String Logout() throws Exception{
		try{
		sessionAttributes.remove("user");
		sessionAttributes.remove("bankinfo");
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}
	
	public void setSession(Map<String,Object> session){
		sessionAttributes = session;
	}
	
	/*public void validate(){
		if("".equals(getUsername())){
			addFieldError("username",getText("username.required"));
		}
		if("".equals(getPassword())){
			addFieldError("password",getText("password.required"));
		}
	}*/
	
	
	
	
}