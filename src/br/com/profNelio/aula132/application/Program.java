package br.com.profNelio.aula132.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula132.entities.Account;
import br.com.profNelio.aula132.entities.BusinessAccount;
import br.com.profNelio.aula132.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Account> listAccount = new ArrayList<>();
		
		System.out.print("Quantas contas deseja criar? ");
		int qtdContas = sc.nextInt();
		for(int i=1; i<=qtdContas; i++) {
			System.out.print("Conta poupança ou Conta Empresarial (p/e): ");
			char tipoConta = sc.next().charAt(0);
			
			System.out.print("Número da conta: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Titular da conta: ");
			String holder = sc.nextLine();
			
			System.out.print("Saldo: ");
			Double balance = sc.nextDouble();
			
			if (tipoConta == 'e') {
				System.out.print("Limite de emprestimo: ");
				Double loanLimit = sc.nextDouble();
				listAccount.add(new BusinessAccount(number, holder, balance, loanLimit));
			} else {
				System.out.print("Taxa de juros: ");
				Double interestRate = sc.nextDouble();
				listAccount.add(new SavingsAccount(number, holder, balance, interestRate));
			}
			System.out.println();
		}
		
		System.out.println("Lista de contas bancárias");
		for(Account account: listAccount) {
			System.out.println(account.toString());
//			System.out.printf("Update %d: %.2f%n", account.getNumber(), account.getBalance());
		}
		
		sc.close();
	}

}
