package br.com.profNelio.aula146.model.entities;

import br.com.profNelio.aula146.model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException  {
		if (balance <= 0 || amount > balance) {
			throw new DomainException("Insufficient balance!");
		}
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		balance -= amount;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account: ");
		sb.append(number);
		sb.append(" Holder: ");
		sb.append(holder);
		sb.append(" Balance: ");
		sb.append(balance);
		sb.append(" Withdraw Limit: ");
		sb.append(withdrawLimit);
		return sb.toString();
	}
}
