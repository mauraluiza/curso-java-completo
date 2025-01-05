package logicaprogramacao; // Declaração do pacote a qual o projeto pertence (uma forma de organizar o código)
import java.util.Locale; // Importação da classe Locale, usada para formatar horários, números e datas conforme variantes locais
import java.util.Scanner; // Importação da classe Scanner, usada para fazer a entrada de dados

public class Algoritmos { // Declaração da classe principal

	public static void main(String[] args) { // Assinatura padrão que a JVM utiliza para reconhecer e iniciar o programa

		Locale.setDefault(Locale.US); // Método que define para região dos Estados Unidos (US), vai formatar segundo esse padrão
		Scanner sc = new Scanner(System.in); // Cria um objeto do tipo Scanner, foi chamado de sc, para realizar a leitura de dados
		
		// Declaração de variáveis:
		String nome;
		int idade;
		double altura;
		
		//Entrada de valor nas variáveis:
		nome = sc.nextLine();
		idade = sc.nextInt();
		altura = sc.nextDouble(); // (informar formatado com ponto, devido ao padrão US definido antes)
		
		//Saída de dados:
		System.out.println("Seu nome é " + nome);            // Fluxo de saída com quebra de linha automática
		System.out.print("Sua idade é " + idade);            // Fluxo de saída sem quebra de linha no final
		System.out.printf(" e sua altura é %.2f", altura);   // Fluxo de saída com formatação de número
		
		sc.close(); // Fecha o objeto sc pois não será mais utilizado
	}
}