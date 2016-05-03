package com.bjitacademy.finalproject.action;
import com.bjitacademy.finalproject.domains.BankAccount;
import com.bjitacademy.finalproject.domains.UserAccount;
import com.bjitacademy.finalproject.service.BankAccountService;


public class ConfirmCreateAccountAction {
	
	private BankAccountService accountService;	
	BankAccount bankaccount;
	
	public void setAccountService(BankAccountService accountService) {
		this.accountService = accountService;
	}	
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public String execute() throws Exception{
		try{
			
			//Integer bankAccNumber = generator.nextInt(1000) + 9999;
			
			this.bankaccount.setActiveStatus("yes");
			UserAccount userAccount = new UserAccount( bankaccount.getUsername(), bankaccount.getPassword(),
					"AccountHolder");
			
			this.bankaccount.setUserAccount(userAccount);
			userAccount.setBankaccnt(this.bankaccount);
			
			System.out.println(this.bankaccount);
			int i = accountService.insert(this.bankaccount);
			System.out.println(i);
			
			return "SUCCESS";
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}	
	}

}
