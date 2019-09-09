package Arrays;

import java.util.Scanner;

public class exerciciosdalista_5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 2; // numero de apostadores
		int gabarito[] = new int[13]; // declaracao do vetor "gabarito"
		int aposta[][] = new int[n][14]; // declaracao da matriz "jogo"
		int acertos[] = new int[n]; // declaracao do vetor "acertos"
		
		int resultado; // resultados oficiais do jogo
		int pontos; // numeros de acertos
		int i, j, numero; // indices

		System.out.println("\n Valores para o gabarito ");
		// Entrada de valores no vetor gabarito
		for (i = 0; i < 13; i++) {
			do {
				System.out.printf("Informe %2do. valor : ", i+1);
				resultado = ler.nextInt();
			} while(resultado < 1 || resultado > 3);
			gabarito[i] = resultado;
		}
		
		System.out.println("\n Valores que seráo apostados ");
		// Entrada de valores na matriz de apostas
		for (i = 0; i < n; i++) {
			numero = i+1;
			System.out.println("");
			System.out.println("Aposta número " + numero + ":");
			aposta[i][0] = numero;
			for (j = 1; j < 14; j++) {
				do {
					System.out.printf("Informe o %2do. resultado de 13: ", j);
					resultado = ler.nextInt();
				} while(resultado < 1 || resultado > 3);
				aposta[i][j] = resultado;
			}
		}
		
		//Verificando os acertos
		for (i = 0; i < n; i++) {
			pontos = 0;
			for (j = 1; j < 14; j++) {
				if(aposta[i][j]==gabarito[j-1]) {
					pontos++;
				}
			}
			acertos[i]=pontos;
	    }

		System.out.println("\n Exibindo os resultados das apostas: ");
		for (i = 0; i < n; i++) {
			System.out.print("Aposta número: " + aposta[i][0] + " Acertos: " + acertos[i]);
			if(acertos[i]==13){
				System.out.print(" ganhador ");
			}
			System.out.print("\n ");
		}
		
	}

}

