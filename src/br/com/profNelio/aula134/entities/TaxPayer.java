package br.com.profNelio.aula134.entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;
	
	public TaxPayer(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}
	
	public abstract double tax();
}
