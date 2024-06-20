package Matriz;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		//criando a matriz
		int[][] mat = new int[n][n];
		
		for(int i =0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
				 
			}
		}
		
		//imprimindo a linha diagonal
		System.out.println("linha diagonal: ");
		for(int i =0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		//quantidade de numeros negativos
		int cont = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("numeros negativos:  " + cont);
		
		scan.close();
	}

}
