import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 07: Programa que lê valores x e y de um ponto e informa em qual
		 * quadrante do plano cartesiano ele se encontra.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		
		if (x > 0 && y > 0) {
			System.out.println("Está no quadrante 1.");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Está no quadrante 2.");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Está no quadrante 3.");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Está no quadrante 4.");
		}
		else if (x == 0 && y == 0) {
			System.out.println("Está na origem.");
		}
		else if (x == 0 && y != 0) {
			System.out.println("Está no eixo y.");
		}
		else if (x != 0 && y == 0) {
			System.out.println("Está no eixo x.");
		}
	}
}