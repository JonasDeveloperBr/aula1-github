package entities;

public class ContaBancaria {

	private static final double TAXA_SAQUE = 5.00;
	
	private int numeroDaConta;
	private String nomeTitular;
	private double valorDeposito;
	private double valorSaldoEmConta;
	
	
	public ContaBancaria(int contaBancaria, String nomeTitular, double valorDeposito) {
//		super();
		this.numeroDaConta = contaBancaria;
		this.nomeTitular = nomeTitular;
		depositarValor(valorDeposito);
	}
	
	public ContaBancaria(int contaBancaria, String nomeTitular) {
//		super();
		this.numeroDaConta = contaBancaria;
		this.nomeTitular = nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void depositarValor(double valorDeposito) {
		if (valorDeposito > 0) {
			this.valorSaldoEmConta += valorDeposito;
		}
	}
	
	public void sacarValor(double valorSaque) {
		valorSaldoEmConta -= (valorSaque + TAXA_SAQUE);
		System.out.println("Saque realizado com sucesso! Por favor aguarde a contagem das cédulas.");
	}
	
	public String toString() {
		return "Account " + numeroDaConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f%n", valorSaldoEmConta);
	}
	
}
