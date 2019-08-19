package arrays;

import java.util.Scanner;

public class exerciciosdalista_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int n = 6; // tamanho do vetor
		int v[] = new int[n]; // declaração do vetor "v"
		int i; // índice ou posição
		int aux = 0; // variavel auxiliar

		// Entrada de valores no vetor
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = entrada.nextInt();
		}

		// Alteração na posição dos valores
		for (i = 0; i < n; i++) {	
			if(i>n/2){i=n;}
			else{
				aux = v[i];
				v[i] = v[n+i-1];
				v[n+i-1] = aux;
			}
		}
		
		// Entrada de valores no vetor
		for (i = 0; i < n; i++) {
			System.out.println("Valor na posição " + (i+1) + " e´ :" + v[i]);
		}

	}

}
