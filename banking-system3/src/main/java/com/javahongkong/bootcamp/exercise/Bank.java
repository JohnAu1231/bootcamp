package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference
	private AtomicLong counter = new AtomicLong(0);
	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<Long, Account>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		
		this.counter.incrementAndGet();
		Long accNum = Long.valueOf(this.counter.get());
		Account newAcc = new CommercialAccount(company, accNum, pin, startingDeposit);
		this.accounts.put(accNum, newAcc);
		
		return accNum;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		this.counter.incrementAndGet();
		Long accNum = Long.valueOf(this.counter.get());
		Account newAcc = new ConsumerAccount(person, accNum, pin, startingDeposit);
		this.accounts.put(accNum, newAcc);
		
		return accNum;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return this.getAccount(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		return this.getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		this.getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return this.getAccount(accountNumber).debitAccount(amount);
	}

	public Long getCounter() {
		return this.counter.get();
	}
}
