package br.com.profNelio.aula218.util;

import java.util.Comparator;

import br.com.profNelio.aula218.entities.Product_WithoutComparable;

public class MyComparator implements Comparator<Product_WithoutComparable> {

	@Override
	public int compare(Product_WithoutComparable p1, Product_WithoutComparable p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
