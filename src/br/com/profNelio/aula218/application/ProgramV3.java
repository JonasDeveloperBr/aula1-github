package br.com.profNelio.aula218.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.profNelio.aula218.entities.Product_WithoutComparable;

public class ProgramV3 {

	public static void main(String[] args) {

		List<Product_WithoutComparable> list = new ArrayList<>();
		
		list.add(new Product_WithoutComparable("TV", 900.00));
		list.add(new Product_WithoutComparable("Notebook", 1200.00));
		list.add(new Product_WithoutComparable("Tablet", 450.00));
		
		System.out.println("Before:");
		for (Product_WithoutComparable p : list) {
			System.out.println(p);
		}
		
		//Implementing Comparable here
		Comparator<Product_WithoutComparable> comp = new Comparator<Product_WithoutComparable>() {
			@Override
			public int compare(Product_WithoutComparable p1, Product_WithoutComparable p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);
		
		System.out.println("\nAfter:");
		for (Product_WithoutComparable p : list) {
			System.out.println(p);
		}
	}

}
