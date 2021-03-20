package br.com.profNelio.aula214.application;

import java.util.HashMap;
import java.util.Map;

import br.com.profNelio.aula214.entities.Product;

public class ProgramTwo {

	public static void main(String[] args) {

		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 900.00);
		Product p2 = new Product("Notebook", 1200.00);
		Product p3 = new Product("Tablet", 400.00);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p3, 15000.00);
		
		System.out.println("Show 1");
		for (Product p : stock.keySet()) {
			System.out.println(p.getName() + "" + p.getPrice());
		}
		System.out.println();
		
		Product ps = new Product("TV", 900.00);

		stock.put(ps, 900.00);
		System.out.println("Show 2");
		for (Product p : stock.keySet()) {
			System.out.println(p.getName() + "" + p.getPrice());
		}
		System.out.println();
		
		//if Product has implementation hashCode and equals, then the return is
		// true, else false;
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
