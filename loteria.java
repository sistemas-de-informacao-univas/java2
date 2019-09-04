package arrays;
import java.util.Scanner;

public class loteria {

	public static void main(String[] args) {
	    
        Scanner teclado = new Scanner(System.in);
        int dezenas = 6;
        int[] aposta = new int[dezenas];

        /*
         * Preparando um array com 6 números informados pelo apostador,
         * sem duplicidade, representando o bilhete da loteria.
         */
        System.out.println("Faça sua aposta: ");
        for (int i = 0; i < dezenas; i++) {
            int nroAposta;
            boolean repetido;
            do {
            	repetido = false;
            	System.out.print("Informe a dezena "+(i+1)+": ");
                nroAposta = teclado.nextInt();
                if (nroAposta < 1 || nroAposta > 60) {
                    System.out.println("Número inválido, aposta cancelada!");
                    return;
                }
        
                for (int j = 0; j < aposta.length; j++) {
                    if (aposta[j] == nroAposta) {
                    	repetido = true;
                    }
                }
                if (repetido) {
                    System.out.println("Ops, número repetido!");
                }
            } while(repetido); // impede a repetição de número

            aposta[i] = nroAposta;
        }
        
        
        
        /*
         * Preparando um array com 6 números gerados randomicamente,
         * sem duplicidade, representando o sorteio da loteria.
         */
        
        int[] sorteio = new int[dezenas];
        
        for (int i = 0; i < dezenas; i++) {
            int sorteado;
            boolean repetido;

            do {
		repetido = false;
                sorteado = (int) (Math.random()*60)+1; //nro aleatorio de 1 a 60
                
                for (int j = 0; j < sorteio.length; j++) {
                    if (sorteio[j] == sorteado) {
                    	repetido = true;
                    }
                }
            } while(repetido); // evita repetição de números
            if(!repetido){
            	sorteio[i] = sorteado;
            }
        }

        
        /*
         * Exibindo o array com 6 números informados pelo apostador
         */
        System.out.println("\nConfira sua aposta: ");
        for (int i = 0; i < aposta.length; i++) {
             System.out.printf("%3d", aposta[i]);
        }

        /*
         * Exibindo o array com 6 números gerados randomicamente
         */
        System.out.println("\nResultado do sorteio: ");
        for (int i = 0; i < sorteio.length; i++) {
             System.out.printf("%3d", sorteio[i]);
        }

        /*
         * Verificando o número de acertos
         */
        int acertos = 0;
        for (int i = 0; i < dezenas; i++) {
            //compara cada nro apostado com os sorteados
            for (int j = 0; j < aposta.length; j++) {
                if (aposta[j] == sorteio[i]) {
                	acertos++;
                }
            }
        }
        
        System.out.println("\nNúmero de acertos: "+acertos);

        
        /*
         * Exibindo o resultado final da aposta
         */
        switch (acertos) {
            case 4: System.out.println("Parabéns. Você acertou a quadra!"); break;
            case 5: System.out.println("Parabéns. Você acertou a quina!"); break;
            case 6: System.out.println("Parabéns. Você é campeão da loteria!"); break;
            default: System.out.println("Não foi dessa vez. Tente novamente!"); break;
        }
    }
}
