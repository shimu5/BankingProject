
CREATE table InterestRate
( 
	AccountType Number(3) NOT NULL,
  	AnnualInterestRate Number(3) NOT NULL,  	  
  	RefInfo varchar2(40) NULL,
    CONSTRAINT InterestRate_fk PRIMARY KEY (AccountType)
);

insert into "INTERESTRATE" ("ACCOUNTTYPE", "ANNUALINTERESTRATE", "REFINFO") values(1, 12, 'Savings');
insert into "INTERESTRATE" ("ACCOUNTTYPE", "ANNUALINTERESTRATE", "REFINFO") values(2, 8, 'Current ');
insert into "INTERESTRATE" ("ACCOUNTTYPE", "ANNUALINTERESTRATE", "REFINFO") values(3, 4, 'Super Saver');

create table BankAccount
( 
	BankAccNumber Number(30) NOT NULL,
  	BankAccountType Number(2) NOT NULL,
  	AccountHolderName varchar2(20) NOT NULL,
  	FatherName varchar2(20) NOT NULL,
  	MotherName varchar2(20) NOT NULL,
  	PermanentAddress varchar2(50) NOT NULL,
  	CurrentAddress varchar2(50)  NULL,
  	ContactNumber varchar2(20) NULL,
  	EmailAddress varchar2(30) NULL,
  	Occupation varchar2(20) NULL,
  	NID_PN varchar2(20) NULL,
  	Currency char(10) NOT NULL,
  	YearlyIncome Number(19,2) default 0 NOT NULL,
  	Balance Number(25,2) default 0 NOT NULL,
  	ActiveStatus varchar2(5) NOT null,
    CONSTRAINT BankAccId_pk PRIMARY KEY (BankAccNumber),
    CONSTRAINT BankAccount_fk FOREIGN KEY (BankAccountType) REFERENCES InterestRate(AccountType)
);

CREATE SEQUENCE S_BankAccount_id START WITH 1001 INCREMENT BY 1 ;


create table UserAccount
(   
  LoginId varchar2(10) NOT NULL,
  Password varchar2(20) NOT NULL,
  LoginType varchar2(20) NOT NULL,
  BankAccNumber number(30) NULL,
  CONSTRAINT UserAccount_fk FOREIGN KEY (BankAccNumber) REFERENCES BankAccount(BankAccNumber) on delete cascade 
);

insert into "USERACCOUNT" ("LOGINID", "PASSWORD", "LOGINTYPE", "BANKACCNUMBER") values('admin', '1234', 'Admin', null);


insert into BankAccount (BankAccountType, AccountHolderName, FatherName, MotherName, PermanentAddress, CurrentAddress, ContactNumber, EmailAddress, Occupation, NID_PN, Currency, ActiveStatus, BankAccNumber) 
values ('1', 'Shamima', 'M Alam', 'ma', 'Uttara', '', '', '', '', '', 'USD', 'yes', '1000');
insert into UserAccount (LoginId, Password, LoginType, BankAccNumber) values ('shimu', '1234', 'AccountHolder', '1000');

create table LedgerAccount
( 
	LedgerId Number(30) NOT NULL,
  	BankAccNumber Number(30) NOT NULL,
  	LedgerDate date NOT NULL,
  	RefInfo varchar2(40) NULL,
  	Description varchar2(50) NULL,
  	DepositAmount Number(19,2) default 0 NOT NULL,
  	WidrawAmount Number(19,2) default 0 NOT NULL,
  	InterestAmount Number(19,2) default 0 NOT NULL,
    CONSTRAINT LedgerAccount_pk PRIMARY KEY (LedgerId),
    CONSTRAINT LedgerAccount_fk foreign key(BankAccNumber) references BankAccount(BankAccNumber) on delete cascade
);
CREATE SEQUENCE S_LedgerAccount_id START WITH 1 INCREMENT BY 1 ;

CREATE table Beneficiary
( 
	BeneficiaryId Number(30) NOT NULL,
	UserBankAccountNumber Number(30) NOT NULL,
	AliasName varchar2(50) NOT NULL,
	BankAccNumber Number(30) NOT NULL,	
	AccountHolderName varchar2(20) NOT NULL,  	
  	Amount Number(19,2) default 0 NOT NULL,
  	MobileNumber varchar2(20) NULL, 
  	EmailId varchar2(30) NULL,
 	CONSTRAINT Beneficiary_pk PRIMARY KEY (BeneficiaryId),
    CONSTRAINT Beneficiary_fk FOREIGN KEY (UserBankAccountNumber) REFERENCES BankAccount(BankAccNumber) on delete cascade 
);

CREATE SEQUENCE S_Beneficiary_id START WITH 1 INCREMENT BY 1;

CREATE table AccountTransferHistory (
	TransferId Number(30) NOT NULL,
	ActionDate date NOT NULL,
	FromAccount Number(30) NOT NULL,
	ToAccount Number(30) NOT NULL,	
	TransferType varchar2(20) NOT NULL,
	Reason varchar2(40) NOT NULL,
  	Amount Number(19,2) default 0 NOT NULL,  	
 	CONSTRAINT AccountTransferHistory_pk PRIMARY KEY (TransferId)     
);
CREATE SEQUENCE S_AccountTransferHistory_id START WITH 1 INCREMENT BY 1;


CREATE table BeneficiaryGroup
( 
	AliasName varchar2(50) NOT NULL,
	GroupName varchar2(50) NOT NULL,
	CONSTRAINT BeneficiaryGroup_pk PRIMARY KEY (GroupName,AliasName)
);
