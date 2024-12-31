import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 04: Programa para informar o tempo de duração de um jogo com base
		 * nos horários de início e fim informados pelo usuário, considerando que cada
		 * jogo possui um tempo mínimo de 1 hora e duração.
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