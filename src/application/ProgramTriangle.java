package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x = new Triangle();
		System.out.println("Enter the measures of triangle X:");
		x.ladoA(sc.nextDouble());
		x.ladoB(sc.nextDouble());
		x.ladoC(sc.nextDouble());
		
		Triangle y = new Triangle();
		System.out.println("Enter the measures of trianle Y:");
		y.ladoA(sc.nextDouble());
		y.ladoB(sc.nextDouble());
		y.ladoC(sc.nextDouble());
		
		Triangle ab;
		ab = new Triangle();
		ab.equals(x);
		
		double areaX = x.calcArea();
		
		double areaY = y.calcArea();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		System.out.println("Larger area: " + (x.largerArea(areaX, areaY) == areaX ? "X" : "Y"));	//Uso da expressão condicional ternária
		
		sc.close();
	}

}
