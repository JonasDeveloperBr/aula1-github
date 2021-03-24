package br.com.profNelio.aula224.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.profNelio.aula224.entities.Product;
import br.com.profNelio.aula224.util.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		System.out.println("---------------------");
		
		//Uses expression lambda and Predicate on method filteredSum2
		double sum2 = ps.filteredSum2(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Sum = " + String.format("%.2f", sum2));
		
		System.out.println("Sum = " + String.format("%.2f", ps.filteredSum2(list, p -> p.getPrice() < 100.00)));
		System.out.println("Sum = " + String.format("%.2f", ps.filteredSum2(list, p -> p.getPrice() > 0.0)));
		System.out.println("---------------------");
		
	}

}
