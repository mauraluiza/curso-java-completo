/* PROJETO 2: Programa para ler os dados de um funcionário (nome, salário bruto e imposto) e mostrar os dados (nome e salário líquido).
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
 * e mostrar novamente os dados do funcionário.
*/

package application;

import entities.Employee;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee(); // Instancia novo objeto da classe Employee

		// Informa atributos para o objeto employee:
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee); // Imprime as informações de employee na tela
		
		System.out.println();
		System.out.print("Which percentage increase salary? "); 
		double percentage = sc.nextDouble(); 
		employee.increaseSalary(percentage); // Informa a porcentagem de aumento como parâmetro para o método
		
		System.out.println();
		System.out.println("Updated data: " + employee); // Imprime as informações atualizadas na tela
		
		sc.close();
	}

}
