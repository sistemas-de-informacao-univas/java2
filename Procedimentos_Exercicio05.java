import java.util.Scanner;
public class divisivel {

	public static void main(String[] args) {

		System.out.print("Digite um numero: ");
		Scanner scanner = new Scanner(System.in);    
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int resultado = verificar(x,y);
	}
	
	public static int verificar(int x, int y) {

		if ((x % y) == 0) {
			System.out.println( x + " é divisível por " + y );
			return 1;
		} else {
			System.out.println( x + " não é divisível por " + y);
			return 0;
		}
	}
}
