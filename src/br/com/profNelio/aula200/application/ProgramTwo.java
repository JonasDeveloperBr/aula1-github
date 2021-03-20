package br.com.profNelio.aula200.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.profNelio.aula200.model.entities.Employee;

public class ProgramTwo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "c:\\temp\\ArqEmployee.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);//Here use method compareTo()
			System.out.println("Total of employee: " + list.size());
			for (Employee employee : list) {
				System.out.println(employee);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
