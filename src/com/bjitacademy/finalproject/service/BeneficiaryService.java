package com.bjitacademy.finalproject.service;

import java.util.List;

import com.bjitacademy.finalproject.dao.BeneficiaryDao;
import com.bjitacademy.finalproject.domains.Beneficiary;

public class BeneficiaryService {

	BeneficiaryDao beneficiaryDao;
	
	public Beneficiary getBeneficiary(Integer id){
		return beneficiaryDao.getBeneficiary(id);
	}
	public void setBeneficiaryDao(BeneficiaryDao beneficiaryDao) {
		this.beneficiaryDao = beneficiaryDao;
	}

	public Integer insert(Beneficiary beneficiary){
		return beneficiaryDao.insert(beneficiary);
	}
	
	public List<Beneficiary> getAllBeneficiaries(Integer bankAccountNumber ){
		return beneficiaryDao.getAllBeneficiaries(bankAccountNumber);
	}
	
	public void delete(Beneficiary beneficiary){
		beneficiaryDao.delete(beneficiary);
	}

}
