package br.com.profNelio.aula134.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula134.entities.TaxPayer;
import br.com.profNelio.aula134.entities.Individual;
import br.com.profNelio.aula134.entities.Company;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> listPessoa = new ArrayList<>();
		
		System.out.print("Enter the number of tax paryers: ");
		int numberOfPerson = sc.nextInt();
		for(int i=1; i<=numberOfPerson; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income:");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				listPessoa.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				listPessoa.add(new Company(name, anualIncome, numberEmployees));
			}
			
			System.out.println();
		}
		
				
		System.out.println("TAXES PAID:");
		double totalTax = 0.0;
		for(TaxPayer pessoas: listPessoa) {
			System.out.printf(pessoas.getName() + ": $ %.2f", pessoas.tax());
			System.out.println();
			totalTax += pessoas.tax();			
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTax);
		
		sc.close();
	}

}
