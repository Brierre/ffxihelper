package com.brierre.ffxihelper.service;

import java.util.List;

import com.brierre.ffxihelper.entity.Account;

public interface AccountService {

	Account fetchAccountByInfo(Integer accountId, String accountName);

	List<Account> fetchAccounts();
}
