package br.com.profNelio.aula130.entities;

public class Employee {

	protected String name;
	private Integer hours;
	private Double value;
	
	Employee(){
	}
	
	public Employee(String name, Integer hours, Double value) {
		this.name = name;
		this.hours = hours;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public Double payment() {
		return hours * value;
	}
	
	public String toString() {
		return name + " $ " + String.format("%.2f", payment());
	}
}
