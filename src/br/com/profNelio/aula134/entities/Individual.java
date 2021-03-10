package br.com.profNelio.aula134.entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public double tax() {
		Double taxPaid = 0.0;
		Double anualIncome = getAnualIncome();
		
		if (anualIncome < 20000) {
			taxPaid = anualIncome * 0.15;
		} else {
			taxPaid = anualIncome * 0.25;
		}
		
		if (healthExpenditures > 0) {
			taxPaid -= (healthExpenditures / 2);
			if (taxPaid < 0.0)
				taxPaid = 0.0;
		}
		
		return taxPaid;
	}

}
