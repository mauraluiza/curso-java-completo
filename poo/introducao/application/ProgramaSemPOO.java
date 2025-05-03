package application;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaSemPOO {
	public static void main(String[] args) {
		
		/*
		 * Programa para calcular a área de dois triângulos e comparar a maior área,
   		 sem utilizar conceitos de Programação Orientada a Objetos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC; // Repetição de variáveis com mesma função
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0; 
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0; // Repetição de fórmula
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); // Repetição de fórmula
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
