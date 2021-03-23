package br.com.profNelio.aula223.util;

import java.util.function.Function;

import br.com.profNelio.aula223.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
