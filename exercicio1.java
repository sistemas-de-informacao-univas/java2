package arrays;

import java.util.Scanner;

public class exerciciosdalista_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int n = 6; // tamanho do vetor
		int v[] = new int[n]; // declaração do vetor "v"
		int i, p; // índice ou posição
		int aux = 0; // variavel auxiliar

		// Entrada de valores no vetor v
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = entrada.nextInt();
		}

		p = n;
		// Alteração na posição dos valores em v
		for (i = 0; i < n/2; i++) {	
			aux = v[i];
			v[i] = v[p-1];
			v[p-1] = aux;
			p--;
		}
		
		// Exibindo os valores armazenados no vetor v
		for (i = 0; i < n; i++) {
			System.out.println("Valor na posição " + (i+1) + " e´ :" + v[i]);
		}

	}

}
