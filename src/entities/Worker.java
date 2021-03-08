package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;//Employee name's
	private WorkerLevel level;//Employee level's with kind of WorkerLevel
	private Double baseSalary;//Base salary Employee's
	//Below I add the associations
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() { }

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	/**
	 * Add contract a employee
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	/**
	 * Remove contract associated of the employee
	 */
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	/**
	 * Total income of the employee on a specific month (Base salary + Hours worked by projects)
	 */
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();//
		System.out.println("Value of the variable cal in method income: " + cal);
		//System.out.println(cal.YEAR);
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());//set on calendar the date of contract
			int c_year = cal.get(Calendar.YEAR);//extract only year of the contract
			int c_month = cal.get(Calendar.MONTH);//extract only month of the contract
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
