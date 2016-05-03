package com.bjitacademy.finalproject.action;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bjitacademy.finalproject.domains.BeneficiaryGroup;
import com.bjitacademy.finalproject.service.BeneficiaryGroupService;

public class ConfirmBeneficiaryGroupAction {

	private String groupName;
	private List<String> aliasNames;
	private BeneficiaryGroupService beneficGroupService;
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<String> getAliasNames() {
		return aliasNames;
	}
	public void setAliasNames(List<String> aliasNames) {
		this.aliasNames = aliasNames;
	}
	
	
	public void setBeneficGroupService(BeneficiaryGroupService beneficGroupService) {
		this.beneficGroupService = beneficGroupService;
	}
	
	public String execute() throws Exception {
		/*int listSize = aliasNames.size();
		HashMap<String,String> grpbeneficiaries = new HashMap<String,String>();;
		BeneficiaryGroup beneficiarygrp = new BeneficiaryGroup();
		for (int i = 0; i < listSize; i++) {
			System.out.println(aliasNames.get(i));
			grpbeneficiaries.put(groupName, aliasNames.get(i))
		}
		
		beneficiarygrp.setGroupName(groupName);
		
		BeneficiaryGroup beneficiarygrp = new BeneficiaryGroup();
		beneficiarygrp.setGroupName(groupName);
		beneficiarygrp.setAliasName(aliasNames);*/
		//int i = this.beneficGroupService.insert(beneficiarygrp);
		this.beneficGroupService.insert(groupName,aliasNames );
		//System.out.println(i);
    	return "success";
    }
}
