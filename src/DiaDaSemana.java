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
		
//		System.out.println("Dia da semana: " + diaPorExtenso);
		System.out.println((diaInformado > 0 && diaInformado < 8 ? ("Dia da semana: " + diaPorExtenso) : ("Valor informado � inv�lido! Informe um valor entre 1 a 7.")));	//usando a condi��o tern�ria
		
		sc.close();

	}

}
/*
36272233

verde lar - 3322-5349 
O n�mero de seu atendimento �  03252722 e servi�o autorizado que atende a sua regi�o �
Amazon Service, telefones 65 3026-5100/65 36220135/65 9 9606-5100

*/