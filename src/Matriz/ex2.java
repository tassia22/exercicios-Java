package Matriz;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int [][] mat = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; i < n; i++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("informe um numero inteiro que pertence a matriz: ");
		int x = scan.nextInt();
		
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("posicao: "+ i+", "+ j + ":");
					if(j > 0) {
						System.out.println("esquerda: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("em cima: " + mat[i-1][j]);
					}
					if(j < mat[i].length-1 ) {
						System.out.println("direita: " + mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("em baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		scan.close();
		
	}
		

}
