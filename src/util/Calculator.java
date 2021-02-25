package util;

public class Calculator {
	//public final double PI = 3.14159;//declara��o n�o est�tica, logo os m�todos tbm devem ser comuns (n�o est�ticos)
	public static final double PI = 3.14159;//se os m�todos s�o est�ticos a constante tbm deve ser est�tica
	
	//public double circumference(double radius) {	//declara��o comum, dessa forma o m�todo s� poder� ser acessado em outras classes a partir de uma inst�ncia de um objeto do tipo Calculator
	public static double circumference(double radius) {	//m�todo est�tico, permite acesso sem instanciar um objeto do tipo Calculator, ou seja, pode ser acessado diretamente a partir da classe, tal como "Calculator.circumference(valorParam);"
		return 2.0 * PI * radius;
	}
	
	//public double volume(double radius) {
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
