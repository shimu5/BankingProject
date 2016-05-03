package com.bjitacademy.finalproject.dao;
import java.util.List;
import com.bjitacademy.finalproject.domains.Beneficiary;

public interface BeneficiaryDao {

	public Beneficiary getBeneficiary(Integer id);
	public Integer insert(Beneficiary beneficiary);
	public List<Beneficiary> getAllBeneficiaries(Integer bankAccountNumber );
	public void delete(Beneficiary beneficiary);
}
