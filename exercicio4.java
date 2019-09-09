package Arrays;

import java.util.Scanner;

public class exerciciosdalista_4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 100; // tamanho do vetor
		int vet[] = new int[n]; // declaracao do vetor "v1"
		int i, j, aux; // indices e auxiliar

		System.out.println("\n Valores para o Vetor ");
		// Entrada de valores no vetor v1
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor : ", i+1);
			vet[i] = ler.nextInt();
		}
		
		// Reposicionando os valores em ordem crescente usando a variavel aux
		for (i = 1; i < n; i++) {
		    for (j = 0; j < i; j++) {
		        if (vet[i] < vet[j]) {
		            aux = vet[i];
		            vet[i] = vet[j];
		            vet[j] = aux;
		        }
		    }
		}
		
		System.out.println("\n Exibindo os valores em ordem crescente: ");
		for (i = 0; i < n; i++) {
	    	System.out.println(vet[i]);
	    }

		// Reposicionando os valores em ordem decrescente usando a variavel aux
		for (i = 1; i < n; i++) {
		    for (j = 0; j < i; j++) {
		        if (vet[i] > vet[j]) {
		            aux = vet[i];
		            vet[i] = vet[j];
		            vet[j] = aux;
		        }
		    }
		}
		
		System.out.println("\n Exibindo os valores em ordem decrescente: ");
		for (i = 0; i < n; i++) {
	    	System.out.println(vet[i]);
	    }

	}

}

