package com.example.Bank_Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bank_Account_Management.entity.Account;
import com.example.Bank_Account_Management.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	//insert details
	@PostMapping
	public String insertUser(@RequestBody Account account) {
		return accountService.insertUser(account);
	}
	
	//fetch by id 
	@GetMapping("/id")
	public Object viewById(@RequestBody Account account) {
		return accountService.viewById(account.getId());
	}
	
	//fetch all data 
	@GetMapping
	public Object viewAll() {
		return accountService.viewAll();
	}
	
	//delete by id 
	@DeleteMapping("/id")
	public String deleteAccountById(@RequestBody Account account) {
		return accountService.deleteAccountById(account.getId());
	}
	
	//delete all
	@DeleteMapping
	public String deleteAllAccount() {
		return accountService.deleteAllAccount();
	}
	
	//update
	@PutMapping
	public String updateAccount(@RequestBody Account account) {
		return accountService.updateAccount(account);
	}

}
