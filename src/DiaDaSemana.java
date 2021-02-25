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
			diaPorExtenso = "terça-feira";
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
			diaPorExtenso = "sábado";
			break;
		default:
			diaPorExtenso = "valor inválido";
			break;
		}
		
//		System.out.println("Dia da semana: " + diaPorExtenso);
		System.out.println((diaInformado > 0 && diaInformado < 8 ? ("Dia da semana: " + diaPorExtenso) : ("Valor informado é inválido! Informe um valor entre 1 a 7.")));	//usando a condição ternária
		
		sc.close();

	}

}
/*
36272233

verde lar - 3322-5349 
O número de seu atendimento é  03252722 e serviço autorizado que atende a sua região é
Amazon Service, telefones 65 3026-5100/65 36220135/65 9 9606-5100

*/