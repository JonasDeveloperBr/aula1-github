package br.com.profNelio.aula228.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.profNelio.aula228.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
//		System.out.print("Plase, entry path of the file: ");
		String path;// = sc.nextLine();
		path = "c:\\temp\\Employee.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String[] strBuffer = line.split(",");
				String name = strBuffer[0];
				String email = strBuffer[1];
				double salary = Double.parseDouble(strBuffer[2]);
				
				list.add(new Employee(name, email, salary));

				line = br.readLine();
			}

			System.out.println("\nFull list of employees:");
			list.stream().forEach(System.out::println);
			System.out.println();
			
			//List email of employees that salary > parameter paramSalary
			System.out.print("Please, entry salary for filter emails: ");
			double paramSalary = sc.nextDouble();
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> names = list.stream()
					.filter(p -> p.getSalary() > paramSalary)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			names.forEach(System.out::println);
			
			//Sum salary of the employees that name start with letter 'M'.
			System.out.println();
			double sumSalary = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Total salary that the names start letter M: " + String.format("%.2f", sumSalary));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
