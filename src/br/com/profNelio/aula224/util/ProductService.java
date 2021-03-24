package br.com.profNelio.aula224.util;

import java.util.List;
import java.util.function.Predicate;

import br.com.profNelio.aula224.entities.Product;

public class ProductService {

	/**
	 * 
	 * @param list
	 * @return double
	 * 
	 * This method is inflexible, there is only one criterion.
	 */
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T')
				sum += p.getPrice();
		}
		return sum;
	}

	/**
	 * 
	 * @param list
	 * @param criteria
	 * @return double
	 * 
	 * This method implementing Predicate for more dynamic use,
	 * it can accept criteria implementing lambda expression.
	 */
	public double filteredSum2(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) 
				sum += p.getPrice();
		}
		return sum;
	}
}
