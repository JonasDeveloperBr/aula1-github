package br.com.profNelio.aula221.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		List<Product> list2, list3, list4;
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		list2 = new ArrayList<>(list);
		list3 = new ArrayList<>(list);
		list4 = new ArrayList<>(list);
		
		//Using ProductPredicate class
		list.removeIf(new ProductPredicate());
		//or
		list2.removeIf(Product::staticProductPredicate);
		//or
		list3.removeIf(Product::nonStaticProductPredicate);
		//or
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		list4.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("--------------");
		for (Product p : list2) {
			System.out.println(p);
		}
		System.out.println("--------------");
		for (Product p : list3) {
			System.out.println(p);
		}
		System.out.println("--------------");
		for (Product p : list4) {
			System.out.println(p);
		}
	}

}
