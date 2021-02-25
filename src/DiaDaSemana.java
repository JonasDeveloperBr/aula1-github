import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int diaInformado = sc.nextInt();
		String diaPorExtenso = "";

		switch (diaInformado) {
		case 1:
			diaPorExtenso = "domingo";
			break;
		case 2:
			diaPorExtenso = "segunda-feira";
			break;
		case 3:
			diaPorExtenso = "ter�a-feira";
			break;
		case 4:
			diaPorExtenso = "quarta-feira";
			break;
		case 5:
			diaPorExtenso = "quinta-feira";
			break;
		case 6:
			diaPorExtenso = "sexta-feira";
			break;
		case 7:
			diaPorExtenso = "s�bado";
			break;
		default:
			diaPorExtenso = "valor inv�lido";
			break;
		}
		
		System.out.println((diaInformado > 0 && diaInformado < 8 ? ("Dia da semana: " + diaPorExtenso) : ("Valor informado � inv�lido! Informe um valor entre 1 a 7.")));	//usando a condi��o tern�ria
		
		sc.close();
	}
}
