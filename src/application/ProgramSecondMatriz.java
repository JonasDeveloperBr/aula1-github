package application;

import java.util.Scanner;

public class ProgramSecondMatriz {

	public static void main(String[] args) {
		
		int qtdLinhas;
		int qtdColunas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de linhas da Matriz: ");
		qtdLinhas = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe a quantidade de colunas da Matriz: ");
		qtdColunas = sc.nextInt();
		sc.nextLine();
		
		int[][] matriz = new int[qtdLinhas][qtdColunas];
		
		System.out.println("Informe os valores da Matriz:");
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Informe um número existente na Matriz: ");
		sc.nextLine();
		int encontrarNumero = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == encontrarNumero) {
					System.out.println("Position: " + i + "," + j);
					
					if(j>0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(j < matriz[i].length - 1) { //verifica se existe Direita
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Top: " + matriz[i-1][j]);
					}
					if(i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}


















