package com.bjitacademy.finalproject.service;



import java.math.BigDecimal;
import java.util.List;

import com.bjitacademy.finalproject.domains.AccountTransferHistory;
import com.bjitacademy.finalproject.domains.Beneficiary;


public interface BankService {
    
    void transfer(Integer from, Integer to, BigDecimal amount,AccountTransferHistory history) throws Exception;

    BigDecimal getBalance(Integer accountIdentity);
    List<Beneficiary> getAllBeneficiaries(Integer bankAccountNumber );

}
