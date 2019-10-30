import java.util.Calendar;
import java.util.Scanner;

public class func2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dia em que você nasceu: "); 
		int diaNasc = in.nextInt();
		System.out.println("Mes em que você nasceu: "); 
		int mesNasc = in.nextInt();
		System.out.println("Ano em que você nasceu: "); 
		int anoNasc = in.nextInt();

		int x = idade(diaNasc, mesNasc, anoNasc);
		if(x>=12){
			System.out.println("Acesso permitido!");
		}else{
			System.out.println("Acesso não permitido!");
		}
	}
	
	public static int idade(int diaNasc, int mesNasc, int anoNasc){
		Calendar cal = Calendar.getInstance();
		int anoAtual = agora.get(Calendar.YEAR);
		int mesAtual = agora.get(Calendar.MONTH) + 1;
		int diaAtual = agora.get(Calendar.DAY_OF_MONTH);

		int idade = anoAtual - anoNasc;
		 	 		
		// Calculando diferencas de mes e dia.
		if(mesAtual < mesNasc) {
			idade--;
		} else {
			if(mesAtual == mesNasc && diaAtual < diaNasc) {
				idade--;
			}
		}

		System.out.println("Idade: " + idade + " anos.");
		return idade;
	}
}