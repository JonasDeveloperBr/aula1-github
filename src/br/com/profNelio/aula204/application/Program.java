package br.com.profNelio.aula204.application;

import java.util.Scanner;

import br.com.profNelio.aula204.services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("Firs: " + ps.first());

		sc.close();
	}

}
/**
 * 
How many values? 3
4
3
2
[4, 3, 2]
Firs: 4
 */