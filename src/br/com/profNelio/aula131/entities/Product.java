package br.com.profNelio.aula131.entities;

public class Product {

	private String name;
	private Double price;
	
	Product(){
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
}
