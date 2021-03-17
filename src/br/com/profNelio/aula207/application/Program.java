package br.com.profNelio.aula207.application;

import java.util.ArrayList;
import java.util.List;

import br.com.profNelio.aula207.entities.Circle;
import br.com.profNelio.aula207.entities.Rectangle;
import br.com.profNelio.aula207.entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
	}
	
	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
