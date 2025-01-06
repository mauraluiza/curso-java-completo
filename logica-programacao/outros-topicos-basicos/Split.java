
public class Split {
	public static void main(String[] args) {
		
		// Split serve para separar uma string em índices a partir de um parâmetro
		
		String frutas = "maçã banana amora uva";
		String[] vect = frutas.split(" "); /* O parâmetro de separação é o espaço, toda vez que houver
											  um espaço é delimitado um novo índice */
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}
}