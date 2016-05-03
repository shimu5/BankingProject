package com.bjitacademy.finalproject.action;

import java.util.Map;

import com.bjitacademy.finalproject.domains.UserAccount;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class AuthenticationInterceptor implements Interceptor{
	
	public void destroy(){
		
	}
	
	public void init(){
		
	}
	
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		
		System.out.println("inside auth interceptor");
		Map<String,Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
		
		UserAccount userinfo = (UserAccount)sessionAttributes.get("user");
		
		if(userinfo.getLoginId()==null || userinfo.equals(null)){
			return Action.LOGIN;			
		}else{
			System.out.println(actionInvocation.getInvocationContext().getName());
			
			return actionInvocation.invoke();
		}
			
	}
}
