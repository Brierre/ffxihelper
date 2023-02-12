package com.brierre.ffxihelper.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.brierre.ffxihelper.entity.Account;
import com.brierre.ffxihelper.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultAccountController implements AccountController {
	@Autowired
	private AccountService accountService;
	
	@Override
	public Account fetchAccountByInfo(Integer accountId, String accountName) {
		log.info("accountId={}, accountName={}", accountId, accountName);
		return accountService.fetchAccountByInfo(accountId, accountName);
	}

	@Override
	public List<Account> fetchAccounts() {
		return accountService.fetchAccounts();
	}

}
