package br.com.profNelio.aula196.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
	
}
