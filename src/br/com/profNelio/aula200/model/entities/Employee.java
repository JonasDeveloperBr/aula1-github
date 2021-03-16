package br.com.profNelio.aula200.model.entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", salary);
	}
	
	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName()); //ordering by name
		//return salary.compareTo(other.getSalary());//ordering by salary
		//return -name.compareTo(other.getName());//descending ordering by name
	}
	
}
