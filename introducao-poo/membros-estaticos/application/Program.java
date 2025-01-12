package application;
import util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; // Declaração de uma constante, é final para que não possa ter o valor alterado

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria
		 * o valor de uma circunferência e do volume de uma esfera para um raio daquele valor.
		 * Informar também o valor de PI com duas casas decimais.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); // não precisa instanciar objeto, pois chama o método circumference direto da classe
		double v = Calculator.volume(radius); // não precisa instanciar objeto, pois chama o método volume direto da classe
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		sc.close();
	}
	
	public static double circumference(double radius) { // precisa ser static para que possa ser chamado na main, pois a main também é static
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
