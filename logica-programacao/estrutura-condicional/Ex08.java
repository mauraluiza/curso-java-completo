package estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 08 (URI 1051): Em um país imaginário denominado Lisarb, todos os habitantes
		 * ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos
		 * e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio.
		 * 
		 * A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais,
		 * equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que
		 * esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 * 
		 *                       de 00 a R$ 2000.00       -------   Isento
		 *                 de R$ 2000.01 até R$ 3000.00   -------     8%
		 *                 de R$ 3000.01 até R$ 4500.00   -------    18%
		 *                       acima de R$ 4500.00      -------    28%
		 *         
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
		 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double taxa;
		double salario = sc.nextDouble();
		sc.close();
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario > 2000 && salario <= 3000) {
			taxa = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f", taxa);
		}
		else if (salario > 3000 && salario <= 4500) {
			taxa = 80 + (salario - 3000) * 0.18;
			System.out.printf("R$ %.2f", taxa);
		}
		else if (salario > 4500) {
			taxa = 80 + 270 + (salario - 4500) * 0.28;
			System.out.printf("R$ %.2f", taxa);
		}
	}
}