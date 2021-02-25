package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Retangle retangle = new Retangle();
		
		System.out.println("Enter rectangle width and height:");
		retangle.setWidth(sc.nextDouble());
		retangle.setHeight(sc.nextDouble());
		
		System.out.println("AREA: " + retangle.areaRetangle());
		System.out.println("PERIMETER: " + retangle.perimeterRetangle());
		System.out.println("DIAGONAL: " + retangle.diagonalRetangle());

	}

}
