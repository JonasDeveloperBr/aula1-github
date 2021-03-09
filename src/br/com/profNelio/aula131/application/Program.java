package br.com.profNelio.aula131.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula131.entities.ImportedProduct;
import br.com.profNelio.aula131.entities.Product;
import br.com.profNelio.aula131.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> listProduct = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		for(int i=1; i <= numberOfProducts; i++) {
			System.out.println("Product #" + i + " data:");
			//sc.nextLine();
			System.out.print("Common, used or imported (c/u/i)? ");
			char kindOfProduct = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (kindOfProduct == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				listProduct.add(new ImportedProduct(name, price, customsFee));
			} else if (kindOfProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				listProduct.add(new UsedProduct(name, price, manufactureDate));
			} else {
				listProduct.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product prod: listProduct) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}
