package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order01032021 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus orderStatus;
	private Client01032021 client01032021;
	private List<OrderItem01032021> listItens = new ArrayList<>();
	
	public Order01032021(Date moment, OrderStatus orderStatus, Client01032021 client01032021){
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client01032021 = client01032021;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return orderStatus;
	}
	
	public void setStatus(OrderStatus status) {
		this.orderStatus = status;
	}
	
	public Client01032021 getClient() {
		return client01032021;
	}
	
	public void setClient(Client01032021 client) {
		this.client01032021 = client;
	}
	
	public List<OrderItem01032021> getItems(){
		return listItens;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(orderStatus + "\n");
		sb.append("Client: ");
		sb.append(client01032021 + "\n");
		sb.append("Order items:\n");
		for (OrderItem01032021 item : listItens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
