package br.com.profNelio.aula134.entities;

public class Company extends TaxPayer {
	
	public Integer numberEmployees;
	
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	public int getNumberEmployees() {
		return numberEmployees;
	}

	@Override
	public double tax() {
		Double anualIncome = getAnualIncome();
		Double taxPaid = anualIncome * 0.16;
		
		if (numberEmployees > 10) {
			taxPaid = anualIncome * 0.14;
		}
		
		return taxPaid;
	}

}
