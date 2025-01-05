package estruturacondicional;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 07 (URI 1041): Leia 2 valores com uma casa decimal (x e y), que devem
		 * representar as coordenadas de um ponto em um plano. A seguir, determine qual o
		 * quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou
		 * na origem. Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto
		 * estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		}
		else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		}
	}
}