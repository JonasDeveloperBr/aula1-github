package br.com.profNelio.aula224.util;

import java.util.List;

import br.com.profNelio.aula224.entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list){
			if (p.getName().charAt(0) == 'T')
				sum += p.getPrice();
		}
		return sum;
	}
}
