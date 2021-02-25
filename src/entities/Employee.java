package entities;

import java.util.Locale;

public class Employee {

	private String name;
	private Double grossSalary;
	private Double tax;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getNameEmployee() {
		return this.name;
	}
	
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return (grossSalary - tax);
	}
	
	public void increaseSalary(double percentage) {
//		Locale.setDefault(Locale.US);
		this.grossSalary += (grossSalary * (percentage / 100));
	}
}
