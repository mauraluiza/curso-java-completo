package estruturarepetitiva;
import java.util.Scanner;
import java.util.Locale;

public class ExFor03 {
	public static void main(String[] args) {
		
		/*
		 * Exercício 03 (URI 1079): Leia 1 valor inteiro N, que representa o número de casos
		 * de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um
		 * deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos
		 * de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o
		 * terceiro valor tem peso 5.
		 */
	
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int N = sc.nextInt();
		double x, y, z, media;
		
		for (int i = 0; i < N; i++) {
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			media = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}
}