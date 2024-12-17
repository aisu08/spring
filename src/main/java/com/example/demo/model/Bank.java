package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bankId;
	private String bankName;
	private String location;
	
	@OneToMany(mappedBy = "bank", cascade= CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Account> acc;

	public int getBankId() {
		return bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Account> getAcc() {
		return acc;
	}

	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}

	public Bank( String bankName, String location, List<Account> acc) {
		
		
		this.bankName = bankName;
		this.location = location;
		this.acc = acc;
	}

	public Bank() {
		
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", location=" + location + ", acc=" + acc + "]";
	}
	
	
	
	

}
