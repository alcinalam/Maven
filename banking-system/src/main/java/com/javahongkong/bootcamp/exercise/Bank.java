package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface{
	private LinkedHashMap<Long, Account> accounts; // object reference
  private static long counter = 0;
	private final static Object lock = new Object();

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.get(accountNumber);
	}
	

	private static long Counter(){
			synchronized(lock) {
				return counter++;
			}
		}
		
	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		//complete the function
    Long accountNumber = Bank.Counter();
		Account newCommercialAcc = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber,newCommercialAcc);
		return accountNumber;
		
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		//complete the function
		Long accountNumber = Bank.Counter();
		Account newConsumerAcc = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		this.accounts.put(accountNumber,newConsumerAcc);
		return accountNumber;
		
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
		getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return this.getAccount(accountNumber).debitAccount(amount);
	}

}
