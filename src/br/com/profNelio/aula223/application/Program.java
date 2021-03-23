package br.com.profNelio.aula223.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.com.profNelio.aula223.entities.Product;
import br.com.profNelio.aula223.util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		//Implementation uses interface Function
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("----------------------------");
		
		
		List<Product> list1 = new ArrayList<>();
		list1.add(new Product("Tv", 900.00));
		list1.add(new Product("Mouse", 50.00));
		list1.add(new Product("Tablet", 350.50));
		list1.add(new Product("HD Case", 80.90));
		
		List<String> names1 = list1.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		names1.forEach(System.out::println);
		System.out.println("----------------------------");
		
		
		List<Product> list2 = new ArrayList<>();
		list2.add(new Product("Tv", 900.00));
		list2.add(new Product("Mouse", 50.00));
		list2.add(new Product("Tablet", 350.50));
		list2.add(new Product("HD Case", 80.90));
		
		List<String> names2 = list2.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		names2.forEach(System.out::println);
		System.out.println("----------------------------");

		List<Product> list3 = new ArrayList<>();
		list3.add(new Product("Tv", 900.00));
		list3.add(new Product("Mouse", 50.00));
		list3.add(new Product("Tablet", 350.50));
		list3.add(new Product("HD Case", 80.90));
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names3 = list3.stream().map(func).collect(Collectors.toList());
		names3.forEach(System.out::println);
		System.out.println("----------------------------");

		List<Product> list4 = new ArrayList<>();
		list4.add(new Product("Tv", 900.00));
		list4.add(new Product("Mouse", 50.00));
		list4.add(new Product("Tablet", 350.50));
		list4.add(new Product("HD Case", 80.90));
		
		List<String> names4 = list4.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names4.forEach(System.out::println);
	}

}





















































