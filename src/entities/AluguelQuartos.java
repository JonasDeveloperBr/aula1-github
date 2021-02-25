package entities;

public class AluguelQuartos {

	String nome;
	String email;
	int numeroDoQuarto;
	final int numeroMaximoDeQuartos = 9;
	
	public AluguelQuartos(String nome, String email, int numeroDoQuarto) {
		if (numeroDoQuarto >= 0 && numeroDoQuarto <= 9) {
			this.nome = nome;
			this.email = email;
			this.numeroDoQuarto = numeroDoQuarto;
		}
	}
	
	public String toString() {
		return numeroDoQuarto + ": " + nome + ", " + email;
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public int numeroDoQuarto() {
		return this.numeroDoQuarto;
	}

}
