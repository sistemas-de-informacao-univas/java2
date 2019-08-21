package arrays;

import java.util.Scanner;

public class exerciciosdalista_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 10; // tamanho do vetor
		int x[] = new int[n]; // declaração do vetor "x"
		int y[] = new int[n]; // declaração do vetor "y"
		int z[] = new int[n*2]; // declaração do vetor "z"
		int i, j, p; // índice ou posição
		boolean iguais; //controle de repetições

		p=1;
		
		System.out.println("\n Valores para X ");
		// Entrada de valores no vetor x
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor: ", p);
			x[i] = ler.nextInt();
			p++;
		}
		
		System.out.println("\n Valores para Y ");
		// Entrada de valores no vetor y
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor: ", p);
			y[i] = ler.nextInt();
			p++;
		}

		p=0;
		
		// União dos valores de x e y em z
		for (i = 0; i < n; i++) {
			iguais = false;
			for (j = 0; j < n; j++) {
				if(x[i] == y[j]){
					iguais = true;
				}
			}
			if(!iguais){
				z[p] = x[i];
				// Exibindo os valores armazenados no vetor z
				System.out.println("Valor " + x[i] + " inserido em Z na posicao " + p);
				p++;
			}
		}
		
		for (i = 0; i < n; i++) {
			iguais = false;
			for (j = 0; j < n; j++) {
				if(y[i] == x[j]){
					iguais = true;
				}
			}
			if(!iguais){
				z[p] = y[i];
				// Exibindo os valores armazenados no vetor z
				System.out.println("Valor " + y[i] + " inserido em Z na posicao " + p);
				p++;
			}
		}

	}

}
