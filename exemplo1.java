package arrays;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n = 10; // tamanho do vetor
		int v[] = new int[n]; // declaração do vetor "v"
		int i; // índice ou posição

		// Entrada de valores no vetor
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = ler.nextInt();
		}

		// Processamento: somar todos os valores, definir o maior e o menor
		// valor
		int menor = v[0];
		int maior = v[0];
		for (i = 0; i < n; i++) {

			if (v[i] < menor)
				menor = v[i];

			if (v[i] > maior)
				maior = v[i];
		}

		// Exibir os valores do vetor e apontar o menor/maior
		System.out.printf("\n");
		String smenor="";
		String smaior="";
		if(menor == maior){
			smenor=" <-- menor e maior valor";
		}
		else{
			smenor=" <-- menor valor";
			smaior=" <-- maior valor";
		}
		
		for (i = 0; i < n; i++) {
			
			if (v[i] == menor)
				System.out.printf("v[%d] = %2d %s\n", i, v[i], smenor);
			else if (v[i] == maior)
				System.out.printf("v[%d] = %2d %s\n", i, v[i], smaior);
			else
				System.out.printf("v[%d] = %2d\n", i, v[i]);
		}

	}

}
