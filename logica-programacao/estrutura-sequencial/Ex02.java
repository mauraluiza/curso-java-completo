package estruturasequencial;
import java.util.Scanner;
import java.util.Locale;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 02 (URI 1002): Faça um programa para ler o valor do raio de um círculo, e depois
		 * mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * 
	     * Fórmula da área: area = π . raio2
	     * Considere o valor de π = 3.14159
	     */
		
		double area, raio;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		
		area = pi * (raio * raio);
		
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
	}

}
