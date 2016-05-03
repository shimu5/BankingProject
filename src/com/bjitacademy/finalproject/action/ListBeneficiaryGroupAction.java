package com.bjitacademy.finalproject.action;

import java.util.Date;


import com.bjitacademy.finalproject.service.BeneficiaryGroupService;

public class ListBeneficiaryGroupAction {

	private BeneficiaryGroupService beneficGroupService;

	public void setBeneficGroupService(BeneficiaryGroupService beneficGroupService) {
		this.beneficGroupService = beneficGroupService;
	}
	
	
	public String execute() throws Exception {
		try{		
			
	    	return "success";
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}	
		
    }
	
}
