package com.example.Bank_Account_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bank_Account_Management.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
