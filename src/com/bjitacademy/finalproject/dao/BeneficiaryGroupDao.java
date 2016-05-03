package com.bjitacademy.finalproject.dao;


import java.util.List;

import com.bjitacademy.finalproject.domains.BeneficiaryGroup;


public interface BeneficiaryGroupDao {
	
	

	//public BeneficiaryGroup getBeneficiaryGroup(String groupname);
	public Integer insert(String groupname, List<String> aliasNames);
	public List<BeneficiaryGroup> getAllBeneficiaryGroup(Integer bankaccntNumber );
	//public void delete(BeneficiaryGroup beneficiary);
}