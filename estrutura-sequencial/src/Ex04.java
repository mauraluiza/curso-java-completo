import java.util.Scanner;
import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 04: Programa que retorna o número de um funcionário e valor total
		 * do seu salário com base na quantidade de horas trabalhadas e valor da hora.
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
