package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.model.Bank;
import com.example.demo.service.BankandAccountservice;

@RestController
public class BankandAccountController {
	@Autowired
	private BankandAccountservice service;
	
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Bank> getAllBanks(){
		return service.getAllBanks();
	}
	
	@RequestMapping(value="/allacc", method=RequestMethod.GET)
	public List<Account> getAllAccounts(){
		return service.getAllAccounts();
	}
	
	@RequestMapping(value="/all/{bankId}", method=RequestMethod.GET)
	public Bank getSpecificBank(@PathVariable int bankId){
		return service.getSpecificBank(bankId);
	}
	
	@RequestMapping(value="/allacc/{id}", method=RequestMethod.GET)
	public Account getSpecificAccount(@PathVariable int id){
		return service.getSpecificAccount(id);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Bank create(@RequestBody Bank bank){
		return service.create(bank);
	}
	
	@RequestMapping(value="/addacc", method=RequestMethod.POST)
	public Account createacc(@RequestBody Account account){
		return service.createacc(account);
	}
	
	@RequestMapping(value="/up/{bankId}", method=RequestMethod.PUT)
	public Bank update(@RequestBody Bank bank, @PathVariable int bankId){
		return service.update(bank,bankId);
	}
	
	@RequestMapping(value="/upacc/{id}", method=RequestMethod.PUT)
	public Account update(@RequestBody Account account, @PathVariable int id){
		return service.update(account,id);
	}
	
	@RequestMapping(value="del/{bankId}", method=RequestMethod.DELETE)
	public void delete(@PathVariable int bankId) {
		service.delete(bankId);
	}
	
	@RequestMapping(value="delacc/{id}", method=RequestMethod.DELETE)
	public void deleteacc(@PathVariable int id) {
		service.deleteacc(id);
	}
	
	
	
	
	
	
	

}
