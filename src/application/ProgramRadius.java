package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramRadius {
	
	//public static final double PI = 3.14159;

	public static void main(String[] args) {

		//Preparation
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator();//Essa é a sintax usada para criar e instanciar um objeto que possuem métodos comuns (não static), como alteramos os métodos para static, então podemos chamar os metodos a partir da própria class

		//Input
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//Processing
		//double c = calc.circumference(radius); //declaração de uso de métodos não estáticos
		double c = Calculator.circumference(radius); //declaração de uso de método estático chamado diretamente a partir do nome da classe
		//double v = calc.volume(radius); //declaração de uso de métodos não estáticos
		double v = Calculator.volume(radius); //declaração de uso de método estático chamado diretamente a partir do nome da classe
		
		//Output
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//	
//	public static double volume(double radius) {
//		return 4.0 * PI * radius * radius * radius / 3.0;
//	}

}
