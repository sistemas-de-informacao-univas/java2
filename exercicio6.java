package arrays;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int l = 3; // numero de linhas
		int c = 3; // numero de colunas
		int a[][] = new int[l][c]; // declaração da matriz "a"
		int b[][] = new int[l][c]; // declaração da matriz "b"
		int i, j, mult; // índices e resultado da multiplicação

		// Entrada de valores na matriz a
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = dados.nextInt();
			}
		}
		
		// Entrada de valores na matriz b
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				b[i][j] = dados.nextInt();
			}
		}
		
		// Entrada de valores na matriz
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				mult = a[i][j] * b[i][j];
				System.out.println(mult);
			}
		}
		
	}

}
