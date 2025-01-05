package estruturasequencial;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 01 (URI 1003): Faça um programa para ler dois valores inteiros, e depois 
		 * mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);

	}

}
