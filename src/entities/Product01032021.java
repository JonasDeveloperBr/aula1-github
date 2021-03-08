package entities;

public class Product01032021 {

	private String name;
	private Double price;
	
	public Product01032021(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getNome() {
		return name;
	}
	
	public void setNome(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}		
}
