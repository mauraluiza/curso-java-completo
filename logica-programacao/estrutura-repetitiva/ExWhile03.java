package estruturarepetitiva;
import java.util.Scanner;

public class ExWhile03 {
	
	/*
	 * Exercício 03 (URI 1134): Um Posto de combustíveis deseja determinar qual de seus produtos
	 * tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível
	 * abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o
	 * usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo
	 * código (até que seja válido). O programa será encerrado quando o código informado for o
	 * número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
	 * abasteceram cada tipo de combustível, conforme exemplo.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int voto = sc.nextInt();
		int a = 0;
		int g = 0;
		int d = 0;
		
		while (voto != 4) {
			if (voto == 1) {
				a += 1;
			} else if (voto == 2) {
				g += 1;
			} else if (voto == 3) {
				d += 1;
			}
			
			voto = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		
		sc.close();
	}
}