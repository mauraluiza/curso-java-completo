package estruturasequencial;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 03 (URI 1007): Fazer um programa para ler quatro valores inteiros A, B, C e D.
		 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
		 * a fórmula: DIFERENCA = (A * B - C * D).
		 */

		int a, b, c, d, dif;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		
		dif = a * b - c * d;
		
		System.out.println("DIFERENCA = " + dif);
	}

}
