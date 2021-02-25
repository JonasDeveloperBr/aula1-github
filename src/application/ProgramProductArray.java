package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductArray;

public class ProgramProductArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja inserir? ");
		int n = sc.nextInt();
		ProductArray[] vet = new ProductArray[n];
		
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vet[i] = new ProductArray(name, price);
		}
		
		double sumPriceOfProduct = 0.0;
		for (int i = 0; i < vet.length; i++) {
			sumPriceOfProduct += vet[i].getPrice();
		}
		
		System.out.printf("Average price = %.2f%n", sumPriceOfProduct / vet.length);

		sc.close();
	}

}
