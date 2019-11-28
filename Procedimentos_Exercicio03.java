
import java.util.Scanner;

public class questao_tres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int x = teclado.nextInt();
		teste(x);
	}
	
	public static void teste(int m){
	
		switch(m){
			case 1:
				System.out.println("SEG");
				break;
			case 2:
				System.out.println("TER");
				break;
			case 3:
				System.out.println("QUA");
				break;
			case 4:
				System.out.println("QUI");
				break;
			case 5:
				System.out.println("SEX");
				break;
			case 6:
				System.out.println("SAB");
				break;
			case 7:
				System.out.println("DOM");
				break;
		}
	}

}
