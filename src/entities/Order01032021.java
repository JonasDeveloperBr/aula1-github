package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order01032021 {

	private Date moment;
	private OrderStatus orderStatus;
	private List<OrderItem01032021> listItens = new ArrayList<>();
	
	public Order01032021(Date moment, OrderStatus orderStatus){
		this.moment = moment;
		this.orderStatus = orderStatus;
	}
	
	public void addItem(OrderItem01032021 item) {
		listItens.add(item);
	}
	
	public void removeItem(OrderItem01032021 item) {
		listItens.remove(item);
	}
	
	public double total() {
		double sumTotal = 0.0;
		
		for(OrderItem01032021 itens: listItens) {
			sumTotal += itens.subTotal();
		}
		
		return sumTotal;
	}
}
