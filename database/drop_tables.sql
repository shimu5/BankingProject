
DROP TABLE BankAccount CASCADE CONSTRAINTS PURGE;
DROP TABLE UserAccount PURGE;  
DROP table LedgerAccount PURGE;
DROP table InterestRate PURGE;
DROP TABLE Beneficiary PURGE;
DROP TABLE AccountTransferHistory PURGE;
DROP TABLE BeneficiaryGroup PURGE;


DROP sequence S_BankAccount_id;
DROP sequence S_LedgerAccount_id;
DROP sequence S_Beneficiary_id;
DROP SEQUENCE S_AccountTransferHistory_id;

