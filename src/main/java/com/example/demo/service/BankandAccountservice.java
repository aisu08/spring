package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.demo.model.Account;
import com.example.demo.model.Bank;
import com.example.demo.repository.accountrepository;
import com.example.demo.repository.bankrepository;

@Service
public class BankandAccountservice {
	@Autowired
	private bankrepository b;
	@Autowired
	private accountrepository ac;
	
	public List<Bank> getAllBanks(){
		return b.findAll();
	}
	
	public List<Account> getAllAccounts(){
		return ac.findAll();
	}
	
	public Bank getSpecificBank(int bankId) {
		return b.findById(bankId).orElse(null);
	}
	
	public Account getSpecificAccount(int id) {
		return ac.findById(id).orElse(null);
	}
	
	public Bank create(Bank bank) {
		return b.save(bank);
	}
	
	public Account createacc(Account account) {
		return ac.save(account);
	}
	
	public Bank update(Bank bank, int bankId) {
		return b.save(bank);
	}
	
	public Account update(Account account, int id) {
		return ac.save(account);
	}
	
	public void delete(int bankId) {
		b.deleteById(bankId);
	}

	public void deleteacc(int id) {
		ac.deleteById(id);
	}
}
