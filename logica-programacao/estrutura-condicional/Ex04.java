package estruturacondicional;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 04 (URI 1046): Leia a hora inicial e a hora final de um jogo. A seguir
		 * calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar
		 * em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int hInicial = sc.nextInt();
		int hFinal = sc.nextInt();	
		sc.close();
		
		if (hInicial > hFinal) {
			System.out.println("O jogo durou " + ((24 - hInicial) + hFinal) + " horas.");
		}
		else if (hInicial < hFinal){
			System.out.println("O jogo durou " + (hFinal - hInicial) + " horas.");
		}
		else {
			System.out.println("O jogo durou 24 horas.");
		}
	}
}