package arrays;
import java.util.Random;
import java.util.Scanner;

public class Randomico {
	public static void main(String[] args) {
		
		//Inicializando as variaveis
		Scanner entrada = new Scanner(System.in);
		int l = 10;
		int c = 10;
		int m[][] = new int [l][c];
		
		// Gerando a matriz m com os valores aleatórios
		for(int i = 0; i < l ; i++){
		   for(int k = 0; k < c ; k++){
			   Random generator = new Random();
			   m[i][k] = generator.nextInt(9) + 1;
		   }
		}
		
		// Exibindo a matriz gerada
		System.out.println("\nMatriz Original");
		for(int i = 0; i < l ; i++){
			System.out.println();
		   for(int k = 0; k < c ; k++){
			   System.out.printf("%3d", m[i][k]);
		   }
		}
		
		System.out.println("\n\n\n1) Somente a diagonal principal");
		for(int i = 0; i < l ; i++){
		   System.out.println();
		   for(int spc = 0; spc < i ; spc++){System.out.printf("  ");}
		   System.out.printf("%d ", m[i][i]);
		}
		
		System.out.println("\n\n\n2) Somente a diagonal secundaria");
		for(int i = l-1; i >= 0 ; i--){
		   System.out.println();
		   for(int spc = 0; spc < i ; spc++){System.out.printf("  ");}
		   System.out.printf("%d ", m[l-i-1][i]);
		}
		
		System.out.println("\n\n\n3) Valores multiplicados por: ");
		int x = entrada.nextInt();
		System.out.println("");
		for(int i = 0; i < l ; i++){
			System.out.println();
		   for(int k = 0; k < c ; k++){
			   System.out.printf("%3d", m[i][k]*x);
		   }
		}
		
	}
}
