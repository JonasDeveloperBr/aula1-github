package br.com.profNelio.aula126.application;

import br.com.profNelio.aula126.entities.Account;
import br.com.profNelio.aula126.entities.BusinessAccount;
import br.com.profNelio.aula126.entities.SavingsAccount;

public class ProgramUpAndDownCasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// Ao tentar fazer:
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		// Ocorreu erro "Exception in thread "main" java.lang.ClassCastException: class entities.SavingsAccount cannot be cast to class entities.BusinessAccount (entities.SavingsAccount and entities.BusinessAccount are in unnamed module of loader 'app')"
		// Para impedir este tipo de erro podemos validar se os tipos são compatíveis, usando:
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}

	}

}
