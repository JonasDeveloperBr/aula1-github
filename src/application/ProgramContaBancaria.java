package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria novaConta;
		double valorDeposito;
		
		System.out.print("Enter account number: ");
		int numeroDaConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();		
		System.out.print("Is there an initial deposit (y/n)? ");
		char answerDeposit = sc.next().charAt(0);
		
		if (answerDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			valorDeposito = sc.nextDouble();
			sc.nextLine();
			
			novaConta = new ContaBancaria(numeroDaConta, nomeTitular, valorDeposito);
		} else{
			novaConta = new ContaBancaria(numeroDaConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(novaConta);
		
		System.out.print("Enter a deposit value: ");
		novaConta.depositarValor(sc.nextDouble());
		System.out.println();

		System.out.println("Updated account data:");
		System.out.println(novaConta);
		
		System.out.print("Enter a withdraw value: ");
		novaConta.sacarValor(sc.nextDouble());
		System.out.println();

		System.out.println("Updated account data:");
		System.out.println(novaConta);

		sc.close();
	}

}
