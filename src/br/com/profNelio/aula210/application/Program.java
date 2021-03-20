package br.com.profNelio.aula210.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.profNelio.aula210.entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		Product prod = new Product("Notebook", 1200.00);
		
		System.out.println(set.contains(prod));
		System.out.println();
		System.out.println("List of product set:");
		for (Product p : set) {System.out.println(p);}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		Set<Product> setTreeSet = new TreeSet<>();
		
		setTreeSet.add(new Product("TV", 900.00));
		setTreeSet.add(new Product("Notebook", 1200.00));
		setTreeSet.add(new Product("Tablet", 400.00));
		
		//Usando o comparable podemos ordenar os elementos da lista
		for (Product p : setTreeSet) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("------ Using ArrayList ------");
		System.out.println();
		
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product("Mouse", 2.00));
		prodList.add(new Product("Keyboard", 50.00));
		prodList.add(new Product("Screen LG Ultrawide", 300.00));
		prodList.add(new Product("Mouse", 2.00));
		System.out.println();
		for (Product p : prodList) {System.out.println(p);}
		
		
		
	}

}
