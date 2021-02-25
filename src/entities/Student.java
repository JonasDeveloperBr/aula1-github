package entities;

public class Student {

	final double MINIMUM_SCORE = 60.0;	//The variable define the minimum necessary to Student Pass
	public String nameStudent;			//Receive the name of Student
	public double nota1, nota2, nota3;	//Points of the three semester

	public void setNameStudent(String name) {
		this.nameStudent = name;
	}
	public void setNota1(double nota) {
		this.nota1 = nota;
	}
	public void setNota2(double nota) {
		this.nota2 = nota;
	}
	public void setNota3(double nota) {
		this.nota3 = nota;
	}
	
	//Mostrar a nota final do aluno no ano
	public double showFinalScore() {
		return nota1 + nota2 + nota3;
	}
	
	//Mostrar a situação do aluno (Pass ou Failed)
	public boolean statusOfStudent() {
		return showFinalScore() >= MINIMUM_SCORE ? true : false;	//Uso da expressão condicional ternária
	}
	
	//Caso Failed mostrar qtos pontos faltam para o aluno ser aprovado (mínimo 60% de 100)
	public double calcRemainingPoints() {
		return !statusOfStudent() ? (MINIMUM_SCORE - showFinalScore()) : 0;
	}
	
}
