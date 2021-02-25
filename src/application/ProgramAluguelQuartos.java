package application;

import java.util.Scanner;

import entities.AluguelQuartos;

public class ProgramAluguelQuartos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented?");
		int qtdDeQuartosParaAlugar = sc.nextInt();
		AluguelQuartos[] vet = new AluguelQuartos[10];
		
		for (int i = 0; i < qtdDeQuartosParaAlugar; i++) {
			sc.nextLine();
			System.out.println("Rent #"+ (i+1) +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numeroDoQuarto = sc.nextInt();
			
			for (int j = 0; j < vet.length; j++) {
				if (vet[j] == null && numeroDoQuarto == j) {
					vet[numeroDoQuarto] = new AluguelQuartos(name, email, numeroDoQuarto);	
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i].getNome() + ", " + vet[i].getEmail());
			}
		}
		
		sc.close();
	}
}
