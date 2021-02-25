package util;

public class ComprarDolar {

	final double valueIOF = 0.06; //IOF
	double dollar = 3.1;
	
	public double showValueOfDollar() {
		return this.dollar;
	}
	
	public double calcTotalOfPayment(double valorDollarBuy) {
		double valueCalculating = dollar * valorDollarBuy;
		return valueCalculating + valueCalculating * valueIOF;
	}
}
