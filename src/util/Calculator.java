package util;

public class Calculator {
	//public final double PI = 3.14159;//declaração não estática, logo os métodos tbm devem ser comuns (não estáticos)
	public static final double PI = 3.14159;//se os métodos são estáticos a constante tbm deve ser estática
	
	//public double circumference(double radius) {	//declaração comum, dessa forma o método só poderá ser acessado em outras classes a partir de uma instância de um objeto do tipo Calculator
	public static double circumference(double radius) {	//método estático, permite acesso sem instanciar um objeto do tipo Calculator, ou seja, pode ser acessado diretamente a partir da classe, tal como "Calculator.circumference(valorParam);"
		return 2.0 * PI * radius;
	}
	
	//public double volume(double radius) {
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
