package br.com.profNelio.aula221.entities;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		List<Product> list2;
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		list2 = new ArrayList<>(list);
		
		//Using ProductPredicate class
		list.removeIf(new ProductPredicate());
		//or
		list2.removeIf(Product::staticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("--------------");
		for (Product p : list2) {
			System.out.println(p);
		}
	}

}
