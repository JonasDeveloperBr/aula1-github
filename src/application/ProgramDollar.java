package application;

import java.util.Locale;
import java.util.Scanner;

import util.ComprarDolar;

public class ProgramDollar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ComprarDolar dolar = new ComprarDolar();
		
		System.out.printf("What is the dollar price? %.2f%n", dolar.showValueOfDollar());
		System.out.print("How many dollars will be bought? ");
		double qtosDolarQuerComprar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", dolar.calcTotalOfPayment(qtosDolarQuerComprar));
		
		sc.close();

	}

}
