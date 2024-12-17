package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	private String accnum;
	private String name;
	private double balance;
	
	@ManyToOne
	@JoinColumn(name="bankId")
	@JsonBackReference
	private Bank bank;
	
	public int getId() {
		return id;
	}

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Account(String accnum, String name, double balance, Bank bank) {
		
		this.accnum = accnum;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}
	
	public Account() {
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accnum=" + accnum + ", name=" + name + ", balance=" + balance + ", bank=" + bank
				+ "]";
	}

	
	
	
	
	
	
	

}
