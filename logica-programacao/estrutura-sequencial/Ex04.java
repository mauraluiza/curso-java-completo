package estruturasequencial;
import java.util.Scanner;
import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 04 (URI 1008): Fazer um programa que leia o número de um funcionário, seu número
		 * de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais
		 */
		
		int n, hTrab;
		double vHora, sal;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		hTrab = sc.nextInt();
		vHora = sc.nextDouble();
		
		sc.close();
		
		sal = hTrab * vHora;
		
		Locale.setDefault(Locale.US);
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f", sal);
	}
}
