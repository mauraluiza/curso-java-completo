
public class Bitwise1 {
	public static void main(String[] args) {
		
		// Operadores bitwise comparam bit por bit entre números (lógica tabela verdade)
		// ATENÇÃO: Não confundir & e | com operadores lógicos && e ||

		int n1 = 89; // binário: 0101 1001
		int n2 = 60; // binário: 0011 1100 
		
		// & operação E bit a bit (ambos V = V)
		System.out.println(n1 & n2); 
		
		/*
		 * 0101 1001
		 * 0011 1100 
		 * FFFV VFFF = 0001 1000 = 24
		 */
		
		// | operação OU bit a bit (pelo menos um V = V)
		System.out.println(n1 | n2); 
		
		/*
		 * 0101 1001
		 * 0011 1100
		 * FVVV VVFV = 0111 1101 = 125
		 */
		
		// ^ operação OU EXCLUSIVO bit a bit (um V, um F = V)
		System.out.println(n1 ^ n2); 
		
		/*
		 * 0101 1001
		 * 0011 1100
		 * FVVF FVFV = 0110 0101 = 101
		 */
	}
}