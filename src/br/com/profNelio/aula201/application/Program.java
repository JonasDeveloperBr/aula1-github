package br.com.profNelio.aula201.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula201.services.BrazilInterestService;
import br.com.profNelio.aula201.services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		//BrazilInterestService is = new BrazilInterestService(2.0);
		//UsaInterestService is = new UsaInterestService(1.0);
		InterestService is = new BrazilInterestService(2.0);
		//or
		//InterestService is = new UsaInterestService(1.0);
		
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
