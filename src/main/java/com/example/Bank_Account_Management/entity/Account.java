package com.example.Bank_Account_Management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message="Account Holder Name cannot be Blank")
	@Column(nullable=false)
	private String accountHolderName;
	
	@NotBlank(message = "Account Number cannot be blank")
	@Column(nullable=false,unique=true)
	private String accountNumber;
	
	@NotBlank(message="Account type is required")
	@Column(nullable=false)
	private String accountType;
	
	@Positive(message="balance must be positive")
	@NotNull(message="balance is required")
	@Column(nullable=false)
	private double accountbalance;
	
	@NotNull(message="branch cannot be blank")
	@Column(nullable=false)
	private String accountBranch;
	
	public int getId() {
		return id;
	
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	

	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

	public String getAccountBranch() {
		return accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + ", accountbalance=" + accountbalance + ", accountBranch="
				+ accountBranch + "]";
	}
	
	

	

}
