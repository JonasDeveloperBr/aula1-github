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
		//Calculator calc = new Calculator();//Essa � a sintax usada para criar e instanciar um objeto que possuem m�todos comuns (n�o static), como alteramos os m�todos para static, ent�o podemos chamar os metodos a partir da pr�pria class

		//Input
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//Processing
		//double c = calc.circumference(radius); //declara��o de uso de m�todos n�o est�ticos
		double c = Calculator.circumference(radius); //declara��o de uso de m�todo est�tico chamado diretamente a partir do nome da classe
		//double v = calc.volume(radius); //declara��o de uso de m�todos n�o est�ticos
		double v = Calculator.volume(radius); //declara��o de uso de m�todo est�tico chamado diretamente a partir do nome da classe
		
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
