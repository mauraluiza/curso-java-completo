package logicaprogramacao;
import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		// %d para inteiro
		// %s para string
		// %f para ponto flutuante (double)
		// %n para quebra de linha
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é $ %.2f %n", produto1, preco1);
		System.out.printf("%s, cujo preço é $ %.2f %n", produto2, preco2);
		System.out.println("");
		System.out.printf("Registro: %d anos, código %d e gênero %s %n", idade, codigo, genero);
		System.out.println("");
		System.out.printf("Medida com oito casas decimais: %.8f %n", medida);
		System.out.printf("Arredondada (três casas decimais): %.3f %n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Padrão US com ponto decimal: %.3f", medida);
		}
}
