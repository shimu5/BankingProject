package com.bjitacademy.finalproject.service;



import java.util.List;

import com.bjitacademy.finalproject.dao.BeneficiaryGroupDao;
import com.bjitacademy.finalproject.domains.BeneficiaryGroup;

public class BeneficiaryGroupService {

	BeneficiaryGroupDao beneficiaryGroupDao;

	public void setBeneficiaryGroupDao(BeneficiaryGroupDao beneficiaryGroupDao) {
		this.beneficiaryGroupDao = beneficiaryGroupDao;
	}

	public Integer insert(String groupname, List<String> aliasNames){
		return this.beneficiaryGroupDao.insert(groupname,aliasNames);
	}

}
