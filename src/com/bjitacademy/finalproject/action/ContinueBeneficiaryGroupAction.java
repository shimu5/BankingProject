package com.bjitacademy.finalproject.action;

import java.util.List;

public class ContinueBeneficiaryGroupAction {

	String groupName;
	private String[] aliasNames;

    public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public String[] getAliasNames() {
		return aliasNames;
	}


	public void setAliasNames(String[] aliasNames) {
		this.aliasNames = aliasNames;
	}
	
	public String execute() throws Exception {
    	for(String s : aliasNames){    		
    		System.out.println(s);
    	}
    	return "success";
    }

}
