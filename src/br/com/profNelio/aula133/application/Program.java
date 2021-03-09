package br.com.profNelio.aula133.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula133.entities.Circle;
import br.com.profNelio.aula133.entities.Rectangle;
import br.com.profNelio.aula133.entities.Shape;
import br.com.profNelio.aula133.util.EnumColor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> listShapes = new ArrayList<>();
		
		System.out.print("Enter the number of Shapes: ");
		int numberOfShape = sc.nextInt();
		
		for (int i=1; i<=numberOfShape; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char option = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			EnumColor color = EnumColor.valueOf(sc.next());
			if (option == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				listShapes.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				listShapes.add(new Circle(color, radius));
			}
			
			System.out.println();
		}
		
		System.out.println("SHAPE AREAS:");
		for (Shape shapes: listShapes) {
			System.out.println(String.format("%.2f", shapes.area()));
		}

		sc.close();
	}

}
