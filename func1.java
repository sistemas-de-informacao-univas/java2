import java.util.Calendar;
import java.util.Scanner;

public class func1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ano em que você nasceu: ");
		int anoNasc = in.nextInt();
		int x = idade(anoNasc);
		if(x>=12){
			System.out.println("Acesso permitido!");
		}else{
			System.out.println("Acesso não permitido!");
		}
	}
	
	public static int idade(int anoNasc){
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int idade = anoAtual - anoNasc;

		System.out.println("Idade: " + idade + " anos.");
		return idade;
	}
}