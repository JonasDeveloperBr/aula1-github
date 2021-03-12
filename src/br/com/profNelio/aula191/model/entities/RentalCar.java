package br.com.profNelio.aula191.model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RentalCar {

	private String nameCar;
	private Date rentalStart;
	private Date rentalEnd;
	private Double priceHour;
	private Double priceDay;
	
	public RentalCar(String nameCar, Date rentalStart, Date rentalEnd, Double priceHour, Double priceDay) {
		this.nameCar = nameCar;
		this.rentalStart = rentalStart;
		this.rentalEnd = rentalEnd;
		this.priceHour = priceHour;
		this.priceDay = priceDay;
	}
	
	public String getNameCar() {
		return nameCar;
	}
	
	public Date getRentalStart() {
		return rentalStart;
	}
	
	public Date getRentalEnd() {
		return rentalEnd;
	}
	
	public Double priceHour() {
		return priceHour;
	}
	
	public Double priceDay() {
		return priceDay;
	}
	
	public Double calcBasicPayment() {
		Long diffInHours = TimeUnit.HOURS.convert((rentalEnd.getTime() - rentalStart.getTime()), TimeUnit.MILLISECONDS);
		if (diffInHours > 12L) {
			return (Math.ceil(diffInHours.doubleValue() / 24)) * priceDay;	// Cobra diária
		} else {
			return diffInHours * priceHour;	// Cobra por hora
		}
	}
	
	public Double calcTax() {
		return calcBasicPayment() * 0.15;
	}
	
	public Double calcTotalPayment() {
		return calcBasicPayment() + calcTax();
	}
	
	
}
