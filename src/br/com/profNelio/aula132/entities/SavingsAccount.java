package br.com.profNelio.aula132.entities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance = balance * interestRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" Taxa de juros: ");
		sb.append(String.format("%.2f", interestRate));
		return sb.toString();
	}

}
