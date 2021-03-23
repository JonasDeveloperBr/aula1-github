package br.com.profNelio.aula218.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.profNelio.aula218.entities.Product_WithoutComparable;

public class ProgramV3 {

	public static void main(String[] args) {

		List<Product_WithoutComparable> list = new ArrayList<>();
		List<Product_WithoutComparable> list2;
		List<Product_WithoutComparable> list3;
		
		list.add(new Product_WithoutComparable("TV", 900.00));
		list.add(new Product_WithoutComparable("Notebook", 1200.00));
		list.add(new Product_WithoutComparable("Tablet", 450.00));
		
		list2 = new LinkedList<>(list);
		list3 = new LinkedList<>(list);
		
		System.out.println("Before:");
		for (Product_WithoutComparable p : list) {
			System.out.println(p);
		}
		
		//Below is a comparator with a lambda expression
		Comparator<Product_WithoutComparable> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		//or
		Comparator<Product_WithoutComparable> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//or -> adding expression lambda as parameter of the method sort
		list3.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		list.sort(comp);
		list2.sort(comp2);
		
		System.out.println("\nAfter:");
		for (Product_WithoutComparable p : list) {
			System.out.println(p);
		}
		System.out.println("\nSecond:");
		for (Product_WithoutComparable p : list2) {
			System.out.println(p);
		}
		System.out.println("\nThird:");
		for (Product_WithoutComparable p : list3) {
			System.out.println(p);
		}
	}

}
