package com.example.Bank_Account_Management.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Bank_Account_Management.entity.Account;
import com.example.Bank_Account_Management.repository.AccountRepo;

@Repository
public class AccountDao {
	
	@Autowired
	AccountRepo accountrepo;
	
	//insert
	public String insertUser(Account account) {
		accountrepo.save(account);
		return " Account Holder Details Inserted Successfully";
	}
	
	//fetchbyID
	
	public Object viewById(int id) {
		Optional<Account> op=accountrepo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}else {
			return "please enter the valid id";
		}
	}
	
	//fetch all
	
	public Object viewAll() {
		List<Account> li=accountrepo.findAll();
		if(li.isEmpty()) {
			return "no data present in the table";
		}else {
			return li;
		}
	}
	
	//delete by id
	
	public String deleteAccountById(int id) {
		Optional<Account> op=accountrepo.findById(id);
		if(op.isPresent()) {
		  accountrepo.deleteById(id);
		  return "Data successfully deleted for the id :"+id;
		}else {
			return "no data present withid";
		
		}
	}
	
	//delete all
	
	public String deleteAllAccount(){
		List<Account> li=accountrepo.findAll();
		if(li.isEmpty()) {
			return "no data present in the table to delete";
		}else {
			accountrepo.deleteAll();
			return "All Data deleted successfully";
		}
	}
	
	//update
	public String updateAccount(Account account) {
		Optional<Account> op=accountrepo.findById(account.getId());
		if(op.isPresent()) {
			accountrepo.save(account);
			return "Data Updated Successfully";
			
		}else {
			return "invalid id";
		}
	}	
}
