package br.com.profNelio.aula191.application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula191.model.entities.RentalCar;

public class ProgramInterface {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		try {
			System.out.println("Enter rental data");
			System.out.print("Car model: ");
			String nameCar = sc.nextLine();
			System.out.print("Pickup (DD/MM/YYYY): ");
			Date rentalStart = sdf.parse(sc.nextLine());
			System.out.print("Return (DD/MM/YYYY): ");
			Date rentalEnd = sdf.parse(sc.nextLine());
			System.out.print("Enter price per hour: ");
			Double priceHour = sc.nextDouble();
			System.out.print("Enter price per day: ");
			Double priceDay = sc.nextDouble();
			
			RentalCar rental = new RentalCar(nameCar, rentalStart, rentalEnd, priceHour, priceDay);
			
			System.out.println("INVOICE:");
			System.out.printf("Basic payment: %.2f", rental.calcBasicPayment());
			System.out.println();
			System.out.printf("Tax: %.2f", rental.calcTax());
			System.out.println();
			System.out.printf("Total payment: %.2f", rental.calcTotalPayment());
		} catch (Exception e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();
	}

}
