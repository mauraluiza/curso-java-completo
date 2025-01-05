package logicaprogramacao;

public class Casting2 {
	public static void main(String[] args) {
		
		double a;
		int b;
		
		a = 5.25;
		b = (int) a;      // Casting fez a conversão de a para inteiro, gerando perda de dados pois 
		                  // era uma variável do tipo double com maior capacidade de armazenamento
		
		System.out.print(b);
	}
}