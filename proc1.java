package funcoes;

import java.util.Calendar;
import java.util.Scanner;

public class proc1 {

	
    public static void main(String[] args) {
        saudacao("Maria", "Sra ");
    }
    
    public static void saudacao(String nome, String tipo){
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);
         
        if(hora >= 6 && hora < 12){
            System.out.println("Bom Dia " + tipo + nome);
        }else if(hora >= 12 && hora < 18){
            System.out.println("Boa Tarde " + tipo + nome);
        }else{
            System.out.println("Boa Noite " + tipo + nome);
        }
        
        int anoAtual = c1.get(Calendar.YEAR);
        Scanner in = new Scanner(System.in);
        System.out.println("Ano em que você nasceu: ");
        int anoNasc = in.nextInt();
        System.out.println("Voce tem: " + (anoAtual - anoNasc) + " anos.");
    }

}
