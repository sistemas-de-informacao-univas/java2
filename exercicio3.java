package Arrays;

import java.util.Scanner;

public class exerciciosdalista_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 10; // tamanho do vetor
		int v1[] = new int[n]; // declaracao do vetor "v1"
		int v2[] = new int[n]; // declaracao do vetor "v2"
		int v3[] = new int[n]; // declaracao do vetor "v3"
		int i; // indice ou posicao

		System.out.println("\n Valores para V1 ");
		// Entrada de valores no vetor v1
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor : ", i+1);
			v1[i] = ler.nextInt();
		}

		System.out.println("\n Valores para V2 ");
		// Entrada de valores no vetor y
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor: ", i+1);
			v2[i] = ler.nextInt();
		}

		// Multiplicacao dos valores de v1 e v2 em v3
		for (i = 0; i < n; i++) {
			v3[i] = v1[i] * v2[i];
		}
		
		System.out.print("\n");
		// Exibindo os valores armazenados no vetor z
		for (i = 0; i < n; i++) {
			System.out.println("A multiplicacao de " + v1[i] + " por " + v2[i] + " e´ " + v3[i]);
		}

	}

}

