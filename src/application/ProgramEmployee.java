package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Locale.setDefault(Locale.US);
		Employee employee = new Employee();
		
		System.out.println("Informe os dados do funcionário:");
		System.out.println("Nome: ");
		employee.setName(sc.nextLine());
		System.out.println("Gross salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.println("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee: " + employee.getNameEmployee() + " , $ " + employee.netSalary());
		
		System.out.println("Wich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + employee.getNameEmployee() + " , $ " + employee.netSalary());

		sc.close();
	}

}
