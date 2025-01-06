import java.util.Scanner;

public class SintaxeFuncoes { // Classe principal do programa
	public static void main(String[] args) { // Escopo principal a ser compilado para rodar o programa

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c); // variável maior recebe valor da função max
		mostraResultado(maior); // função mostraResultado sendo chamada com parâmetro da variável maior 

		sc.close();
	}

	public static int max(int x, int y, int z) { // escopo da função max (variáveis de função não precisam tem vínculo com programa principal)
		int aux; // aux é uma variável interna que existe apenas quando a função max é chamada
		if (x > y && x > z) { 
			aux = x; 
		} else if (y > x && y > z) {
			aux = y;; 
		} else {
			aux = z;; 
		}
		return aux; // max retorna o valor inteiro contido na variável aux
	}
	
	public static void mostraResultado(int value) { // escopo da função mostraResultado (void pois não retorna nenhum valor, apenas imprime value que é definido pelo parâmetro na chamada da função)
		System.out.println("O maior é: " + value);
	}
}