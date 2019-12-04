import java.util.Scanner;
public class maior_valor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);   
		System.out.print("Digite primeiro um numero: ");
		int x = scanner.nextInt();
		System.out.print("Digite segundo um numero: ");
		int y = scanner.nextInt();
		
		int resultado = verificar(x,y);
		System.out.print(resultado + " é o maior valor ");
	}
	
	public static int verificar(int x, int y) {

		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
}
