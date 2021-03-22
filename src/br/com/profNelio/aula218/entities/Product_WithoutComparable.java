package br.com.profNelio.aula218.entities;

public class Product_WithoutComparable {

	private String name;
	private Double price;
	
	public Product_WithoutComparable() {
	}
	
	public Product_WithoutComparable(String name, Double price) {
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
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
