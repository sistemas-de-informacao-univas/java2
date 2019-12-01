import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
	   Scanner teclado = new Scanner(System.in);
	   System.out.println("Insira o valor: ");
	   System.out.print("=> ");
	   String palavra = teclado.nextLine();
	   if (new StringBuilder(palavra).reverse().toString().equals(palavra)) {
	       System.out.println("É capicua!");
	   } else {
	       System.err.println("Não é capicua!");
	   }
	
	}
}
