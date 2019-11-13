package funcoes;

import java.util.Scanner;

public class caluladora {
	
	public static void main (String args[]){
		menu();
	}
	
	// MENU
    public static void menu(){ 
          
        //declarando as varíaveis  
        int opcao = 0;  
        double num1 = 0;  
        double num2 = 0;
        double resposta = 0;
        String operador = "";
        
        do{
	          
			Scanner input = new Scanner(System.in);
	        System.out.println("-Escolha uma opção-");  
	        System.out.println("1. Soma");    
	        System.out.println("2. Subtracao");    
	        System.out.println("3. Multiplicacao");    
	        System.out.println("4. Divisao");    
	        System.out.println("0. Sair");    
	        System.out.println("Operação: ");    
	          
	        opcao = input.nextInt();  
        
			Scanner input1 = new Scanner(System.in);    
			
			if(opcao>=1 && opcao<5){
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextDouble();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextDouble();
				
				switch(opcao){
					case 1:
						resposta = adicao(num1, num2);
		                operador = "+";  
		                break;  
					case 2: 
		            	resposta = subtracao(num1, num2);
		            	operador = "-"; 
						break;  
					case 3:
						resposta = multiplicacao(num1, num2); 
						operador = "*"; 
						break;  
					case 4: 
						resposta = divisao(num1, num2);  
						operador = "/"; 
						break;  
				}     
				
				System.out.printf("\nResultado: %3.1f %s %3.1f = %3.1f \n", num1, operador, num2, resposta);
			}
			
        } while (opcao != 0);
        System.out.println("Fim das operações!");
    }  

    // OPERACOES
    public static double adicao(double num1, double num2) {
    	double operacao = num1 + num2;
        return operacao;
    }
    
    public static double subtracao(double num1, double num2){
    	double operacao = num1 - num2;
    	return operacao;
    }
    
    public static double multiplicacao(double num1, double num2){
    	double operacao = num1 * num2;
    	return operacao;
    }
    
    public static double divisao(double num1, double num2){
    	double operacao = num1 / num2;
    	return operacao;
    }

}
