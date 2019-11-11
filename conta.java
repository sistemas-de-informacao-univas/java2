package funcoes;

import java.util.Scanner;

public class conta {

	public static String historico = "";

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu(){
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		double valor = 0;
		double saldo = 0;
		do{
			System.out.println("\n Escolha uma opção:");
			System.out.println("1 - Extrato");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
				case 1:
					extrato(saldo);
					break;
				case 2:
					System.out.print("Valor do saque: ");
					valor = entrada.nextDouble();
					saldo = saque(valor, saldo);
					break;
				case 3:
					System.out.print("Valor do deposito: ");
					valor = entrada.nextDouble();
					saldo = deposito(valor, saldo);
					break;
				case 4:
					System.out.println("Sistema encerrado!");
					break;
				default:
					System.out.println("Opção invalida!");
			}
		}while(opcao!=4);
	}

	public static void extrato(double saldo){
		System.out.println("\n historico de operações: " + historico);
		System.out.println("\n Saldo atual: " + saldo);
	}

	public static double saque(double valor, double saldo){
		saldo = saldo - valor;
		historico = historico + "\n Saque de " + valor;
		return saldo;
	}

	public static double deposito(double valor, double saldo){
		saldo = saldo + valor;
		historico = historico + "\n Deposito de " + valor;
		return saldo;
	}
}