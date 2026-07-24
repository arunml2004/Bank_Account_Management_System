package com.example.Bank_Account_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bank_Account_Management.dao.AccountDao;
import com.example.Bank_Account_Management.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountDao accountDao;
	
	//insert
	public String insertUser(Account account) {
		return accountDao.insertUser(account);
	}
	
	//fetch by id
	public Object viewById(int id) {
		return accountDao.viewById(id);
	}
	
	//fetch all
	public Object viewAll() {
		return accountDao.viewAll();
	}
	
	//delete by id
	public String deleteAccountById(int id) {
		return accountDao.deleteAccountById(id);
	}
	
	//delete by all	
	public String deleteAllAccount() {
		return accountDao.deleteAllAccount();
	}
	
	//update	
	public String updateAccount(Account account) {
		return accountDao.updateAccount(account);
	}
}
