package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem01032021 {

	private Integer quantity;
	private Double price;
	private Product01032021 product01032021;

	public OrderItem01032021(int quantity, double price, Product01032021 product01032021) {
		this.quantity = quantity;
		this.price = price;
		this.product01032021 = product01032021;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product01032021 getProduct() {
		return product01032021;
	}
	
	public void setProduct01032021(Product01032021 product01032021) {
		this.product01032021 = product01032021;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return product01032021.getNome()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity +
				", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
