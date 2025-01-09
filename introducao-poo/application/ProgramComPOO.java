package application;
import entities.Triangle; // importa a classe Triangle do pacote entities
import java.util.Locale;
import java.util.Scanner;

public class ProgramComPOO {
	public static void main(String[] args) {
		
		/*
		 * Programa para calcular a área de um triângulo, utilizando conceitos de Programação
		 * Orientada a Objetos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; // declara x e y como variáveis da classe Triangle
		x = new Triangle(); // declara x como instância da classe Triangle
		y = new Triangle(); // declara x como instância da classe Triangle
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); // armazena o valor de entrada no atributo 'a' do objeto x
		x.b = sc.nextDouble(); // armazena o valor de entrada no atributo 'b' do objeto x
		x.c = sc.nextDouble(); // armazena o valor de entrada no atributo 'c' do objeto x
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); // armazena o valor de entrada no atributo 'a' do objeto y
		y.b = sc.nextDouble(); // armazena o valor de entrada no atributo 'b' do objeto y
		y.c = sc.nextDouble(); // armazena o valor de entrada no atributo 'c' do objeto y
		
		double areaX = x.area(); // chama o método area do objeto x, calcula e armazena o valor em areaX
		
		double areaY = y.area(); // chama o método area do objeto y, calcula e armazena o valor em areaY
		
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
