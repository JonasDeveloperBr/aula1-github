package br.com.profNelio.aula127.entities;

public class BusinessAccount extends Account {
	
	private Double loanLimite;

	BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}
	
	public void setLoanLimite(Double loanLimite) {
		this.loanLimite = loanLimite;
	}
	
	public Double getLoanLimite() {
		return loanLimite;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimite) {
			loanLimite += amount - 10.0;
		}
	}
	
	@Override
	public void withDraw(Double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
}
