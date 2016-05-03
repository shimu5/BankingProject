package com.bjitacademy.finalproject.dao;

import java.util.Date;
import java.util.List;

import com.bjitacademy.finalproject.domains.AccountTransferHistory;

public interface AccountTransferHistoryDao {

	public Integer insert(AccountTransferHistory accntHistory);
	public List<AccountTransferHistory> SearchBalanceTransferHistory(Date from, Date to,Integer accntNumber );
}
