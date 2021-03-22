package br.com.profNelio.aula218.application;

import java.util.ArrayList;
import java.util.List;

import br.com.profNelio.aula218.entities.Product_WithoutComparable;
import br.com.profNelio.aula218.util.MyComparator;

public class ProgramV2 {

	public static void main(String[] args) {

		List<Product_WithoutComparable> list = new ArrayList<>();
		
		list.add(new Product_WithoutComparable("TV", 900.00));
		list.add(new Product_WithoutComparable("Notebook", 1200.00));
		list.add(new Product_WithoutComparable("Tablet", 450.00));
		
		System.out.println("Before:");
		for (Product_WithoutComparable p : list) {
			System.out.println(p);
		}
		System.out.println();
		
		list.sort(new MyComparator());
		
		System.out.println("After:");
		for (Product_WithoutComparable p : list) {
			System.out.println(p);
		}
	}

}
