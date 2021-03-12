package br.com.profNelio.aula146.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula146.model.entities.Account;
import br.com.profNelio.aula146.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Account: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial badobealance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.println(account);
			
			System.out.print("Value of withdraw: ");
			Double valueWithdraw = sc.nextDouble();
			account.withdraw(valueWithdraw);
			
			System.out.println();
			System.out.printf("Current balance: %.2f", account.getBalance());
		} catch (DomainException e) {
			System.out.println("Operation not allowed: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error! Please, call your account manager for more information!");
		}

		sc.close();
	}

}
