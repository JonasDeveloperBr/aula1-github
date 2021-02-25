package entities;

public class Triangle {
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	//funções/métodos
	//Gets and Sets
	public void ladoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public void ladoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public void ladoC(double ladoC) {
		this.ladoC = ladoC;
	}	
	
	//calcular Perimetro
	public double calcPerimeter() {
		return (ladoA + ladoB + ladoC) / 2.0;
	}
	
	//calcular Area
	public double calcArea() {
		double valueOfPerimeter = calcPerimeter();
		return (Math.sqrt(valueOfPerimeter * (valueOfPerimeter - ladoA) * (valueOfPerimeter - ladoB) * (valueOfPerimeter - ladoC) ));
	}
	
	//maior Area
	public double largerArea(double areaOne, double areaTwo) {
		return ((areaOne > areaTwo) ? areaOne : areaTwo);	//Uso da expressão condicional ternária
	}
	
}
