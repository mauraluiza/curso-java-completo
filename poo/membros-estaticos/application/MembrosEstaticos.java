package application;

import util.Calculator; // Importa a classe Calculator, mas também é possível escrever tudo em um único código fonte com modificador de acesso static nos métodos
import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {

	//Membros estáticos (atributos/métodos) pertencem a classe e são compartilhados igualmente com todos os objetos
	
	public static final double PI = 3.14159; // Declaração de uma constante: 'static' para que seja reconhecida em todo o programa MembrosEstaticos;
	                                         //                              'final' para que não possa ter o valor alterado.

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e
   		 * do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); // Não precisa instanciar objeto, pois chama o método estático circumference direto da classe Calculator
		double v = Calculator.volume(radius); // Não precisa instanciar objeto, pois chama o método estático volume direto da classe Calculator
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		sc.close();
	}

	/* O CÓDIGO ABAIXO TAMBÉM PODE SER SUBSTITUÍDO PELA CLASSE CALCULATOR
	public static double circumference(double radius) { // static para que possa ser chamado na main (a main também é static, static acessa static)
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) { // static para que possa ser chamado na main (a main também é static, static acessa static)
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	*/
}
