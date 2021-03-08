package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem01032021 {

	private int quantity;
	private double price;
	private List<Product01032021> listProduct = new ArrayList<>();

	public OrderItem01032021(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	public List<Product01032021> getListProduct(){
		return listProduct;
	}
	
}
