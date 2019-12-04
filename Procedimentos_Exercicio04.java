import java.util.Scanner;
public class primo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite um numero: ");
		int numero = scanner.nextInt();
		
		int resultado = verificar(numero);
	}
	
	public static int verificar(int numero) {

		boolean isPrimo = true;
		for (int i = 2; i <= numero; i++) {
			if ( ( (numero % i) == 0) && (i != numero) ) {
				isPrimo = false;
				break;
			}
		}
		if (isPrimo) {
			System.out.println( "é Primo" );
			return 1;
		} else {
			System.out.println( "Não é Primo " );
			return 0;
		}
	}
}
