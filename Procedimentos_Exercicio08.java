// Usando a recursividade
public class recursivo {
	public static void main(String[] args) {
		int resposta =fatorial(100, 1);
    System.out.println(resposta);
	}
	
	public static int fatorial(int x, int y){
		y = y * x;
		x = x - 1;
		if(x>=1){
			fatorial(x,y);
		}
		else{
			 return y;
		}
	}
}

//-------------------------------------------------------------

// Não usando a recursividade
public class nao_recursivo {
	public static void main(String[] args) {
		int resposta = fatorial(3);
		System.out.println(resposta);
	}
	
	public static int fatorial(int x){
		
		int fat = 1;
		for(int i=x;i>=1;i--){
			 fat = fat * i;
		}
		
		return fat;
		
	}

}
