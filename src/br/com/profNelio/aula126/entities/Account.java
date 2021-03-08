package br.com.profNelio.aula126.entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	//Saque
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	//Deposito
	public void deposit(double amount) {
		balance += amount;
	}
}
