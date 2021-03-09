package br.com.profNelio.aula132.entities;

public abstract class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
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
	
	public void withDraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Conta: ");
		sb.append(number);
		sb.append(" Titular: ");
		sb.append(holder);
		sb.append(" Saldo: ");
		sb.append(String.format("%.2f", balance));
		
		return sb.toString();
	}
}
