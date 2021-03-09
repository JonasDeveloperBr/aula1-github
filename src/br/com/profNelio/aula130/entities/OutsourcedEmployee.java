package br.com.profNelio.aula130.entities;

public class OutsourcedEmployee extends Employee {

	private Double charge;
	
	OutsourcedEmployee() {
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double value, Double charge) {
		super(name, hours, value);
		this.charge = charge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + charge * 1.1;
	}
	
	public String toString() {
		return name + " $ " + String.format("%.2f", payment());
	}
}
