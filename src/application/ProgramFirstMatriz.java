package application;

import java.util.Scanner;

public class ProgramFirstMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de linhas e colunas da Matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		sc.nextLine();
		System.out.println("Informe os " + mat.length * mat.length + " valores da Matriz precedidos de Enter:");
		for(int i = 0; i < mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("Todos os elementos da Matriz:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Todos os valores negativos da Matriz:");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					System.out.println(mat[i][j] + " ");
				}
			}
		}
		
		sc.close();
	}

}
