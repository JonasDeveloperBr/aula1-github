package br.com.profNelio.aula222.util;

import java.util.function.Consumer;

import br.com.profNelio.aula222.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
}
