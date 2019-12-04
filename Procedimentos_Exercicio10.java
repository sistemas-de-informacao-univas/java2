import java.util.Scanner;
public class combinacoes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);   
		System.out.print("Digite o valor de N: ");
		int n = scanner.nextInt();
		System.out.print("Digite o valor de P: ");
		int p = scanner.nextInt();
		
		double resultado = verificar(n,p);
		System.out.print(" O numero de combinações é " + resultado);
	}
	
	public static double verificar(int n, int p) {
		double c = fatorial(n) / (fatorial(p) * fatorial(n-p));
		return c;
	}
	
	public static double fatorial(int x){
		double fat = 1;
		for (int i=1; i<=x; i++){
			fat=fat*i;
		}
		return fat;
	}
}
