package br.com.profNelio.aula222.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import br.com.profNelio.aula222.entities.Product;
import br.com.profNelio.aula222.util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		System.out.println("Before of the update");
		list.forEach(System.out::println);

		list.forEach(new PriceUpdate());	//Do the update
		
		System.out.println("\nAfter of the update");
		list.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		//Reference method with method non static
		List<Product> list1 = new ArrayList<>();
		list1.add(new Product("Tv", 900.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.50));
		list1.add(new Product("HD Case", 80.90));

		list1.forEach(Product::staticPriceUpdate);	//Do the update using reference method with static method
		list1.forEach(System.out::println);			//Print list
		System.out.println("-----------------");
		
		
		//expression lambda declared
		List<Product> list2 = new ArrayList<>();
		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("HD Case", 80.90));
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};
		
		list2.forEach(cons);	//Do update uses a variable cons where has a anonymous function
		list2.forEach(System.out::println);
		System.out.println("-----------------");
		
		//Expression lambda in line
		List<Product> list3 = new ArrayList<>();
		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.00));
		list3.add(new Product("HD Case", 80.90));
		
		list3.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list3.forEach(System.out::println);
	}

}
