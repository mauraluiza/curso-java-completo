package estruturacondicional;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 06 (URI 1037): Você deve fazer um programa que leia um valor qualquer
		 * e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], 
		 * 50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		 * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		sc.close();
		
		if (x >= 0 && x <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (x > 25 && x <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (x > 50 && x <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (x > 75 && x <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}	
	}
}