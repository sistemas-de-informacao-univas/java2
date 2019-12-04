import java.util.Scanner;

public class somente_letras {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite alguma informação: ");
        String entrada = in.nextLine();
        int resp = verificar(entrada);
    
    }
    
    public static int verificar(String entrada) {

    	if(entrada.substring(0, 1).matches("[A-Z]*") || entrada.substring(0, 1).matches("[a-z]*")){
			System.out.println("é uma letra");
			return 1;
		} else {
			System.out.println("não é uma letra");
			return 0;
	    }
	}
}
