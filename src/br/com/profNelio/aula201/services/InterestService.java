package br.com.profNelio.aula201.services;

public interface InterestService {

	double getInterestRate();
	double payment(double amount, int months);
}
