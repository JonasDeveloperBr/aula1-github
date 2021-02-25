import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		System.out.println("Digite uma palavra:");
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		
		//Entrada de dados com n�mero inteiro
		int i;
		System.out.println("Digite um valor inteiro: ");
		i = sc.nextInt();
		System.out.println("Voc� digitou: " + i);
		
		//Entrada de dados com n�meros double
		double y;
		System.out.println("Digite um valor double:");
		y = sc.nextDouble();
		System.out.println("Valor digitado: " + y);
		
		//Entrada de v�rios valores em uma �nica linha
		String a;
		int b;
		double c;
		System.out.println("Digite os dados em uma �nica linha separados por espa�o ' ':");
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();
	}

}
