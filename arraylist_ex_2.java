package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_exercicio2 {

	public static void main(String[] args) {
		
		int n=3;
		Scanner ler = new Scanner(System.in);
		ArrayList<String> telefones = new ArrayList<String>();
		
		for(int i=0; i<n; i++){
			System.out.print("Nome: ");
			String nome = ler.next();
			
			System.out.print("Telefone: ");
			String telefone = ler.next();
			
			telefones.add(nome + "," + telefone);
			System.out.println("Adicionado com sucesso!");
		}

		System.out.print("\n\nPesquisando por: ");
		String nome = ler.next();
		for(int i=0; i<n; i++){
			String telefone_dados = telefones.get(i);
			String dados[] = telefone_dados.split(",");
			
			if(dados[0].equals(nome)){
				System.out.println("\n\nTelefone encontrado: " + dados[1]);
			}
		}
	}
}
