package com.bjitacademy.finalproject.service;

import java.util.Date;
import java.util.List;

import com.bjitacademy.finalproject.dao.AccountTransferHistoryDao;
import com.bjitacademy.finalproject.domains.AccountTransferHistory;


public class TransferHistoryService {

	AccountTransferHistoryDao transHistoryDao;
		
	public void setTransHistoryDao(AccountTransferHistoryDao transHistoryDao) {
		this.transHistoryDao = transHistoryDao;
	}
	
	public List<AccountTransferHistory> SearchBalanceTransferHistory(Date from, Date to,Integer accntNumber ){
		return transHistoryDao.SearchBalanceTransferHistory(from,to,accntNumber);
	}

}
