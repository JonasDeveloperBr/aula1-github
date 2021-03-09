package br.com.profNelio.aula130.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula130.entities.Employee;
import br.com.profNelio.aula130.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployee = sc.nextInt();
		for (int i=1; i <= numberOfEmployee; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double value = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				Double charge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, value, charge));
			} else {
				list.add(new Employee(name, hours, value));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : list) {
			System.out.println(" " + employee.toString());
		}

		sc.close();
	}

}
