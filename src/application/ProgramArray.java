package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int n = sc.nextInt();
		double media = 0.0;
		double[] vect = new double[n];
		
		System.out.println("Informe os valores do Array: ");
		for (int i = 0 ; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Valor da " + i + "º posição do vetor: " + vect[i]);
			media += vect[i];
		}
		
		System.out.printf("Média dos valores informados no vetor é: %.2f%n", media / vect.length);
		
		
		
		sc.close();

	}

}
