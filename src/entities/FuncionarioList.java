package entities;

public class FuncionarioList {

	private int idFuncionario;
	private String nomeFuncionario;
	private double salarioFuncionario;
	
	public FuncionarioList(int idFuncionario, String nomeFuncionario, double salarioFuncionario) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}
	
	public void increaseSalary(double percentOfIncrease) {
		salarioFuncionario += salarioFuncionario * percentOfIncrease / 100;
	}

	public String toString() {
		return idFuncionario + ", " + nomeFuncionario + ", " + String.format("%.2f%n", salarioFuncionario);
	}
}
