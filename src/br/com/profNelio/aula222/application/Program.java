package br.com.profNelio.aula222.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.profNelio.aula222.entities.Product;
import br.com.profNelio.aula222.util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		List<Product> list1;
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		list1 = new ArrayList<>(list);
		
		System.out.println("Before of the update");
		list.forEach(System.out::println);

		list.forEach(new PriceUpdate());	//Do the update
		
		System.out.println("\nAfter of the update");
		list.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		list1.forEach(Product::staticPriceUpdate);	//Do the update using reference method with static method
		list1.forEach(System.out::println);			//Print list
		
	}

}
