
public class FuncoesString {
	public static void main(String[] args) {

		String abc = "   ABCD efgh BC ABC EFgh   ";
		String minusculo = abc.toLowerCase(); // Tudo minúsculo
		String maiusculo = abc.toUpperCase(); // Tudo maiúsculo
		String trim = abc.trim(); // Recorta espaços antes e depois da String
		String substring = abc.substring(5); // Recorta o que vem antes da posição informada
		String substring2 = abc.substring(5, 11); // Recorta o que está fora das posições de início e fim
		String replace = abc.replace('A', 'x'); // Substitui todas as ocorrências do primeiro pelo segundo (caracter)
		String replace2 = abc.replace("ABC", "xyz"); // Substitui todas as ocorrências do primeiro pelo segundo (String)
		int index = abc.indexOf("BC"); // Retorna a primeira posição da String informada
		int index2 = abc.lastIndexOf("BC"); // Retorna a última posição da String informada
		
		System.out.println("Original: -" + abc +"-");
		System.out.println("toLowerCase: -" + minusculo +"-");
		System.out.println("toUpperCase: -" + maiusculo +"-");
		System.out.println("trim: -" + trim +"-");
		System.out.println("substring(5): -" + substring +"-");
		System.out.println("substring(5,11): -" + substring2 +"-");
		System.out.println("replace('A', 'x'): -" + replace +"-");
		System.out.println("replace('ABC', 'xyz'): -" + replace2 +"-");
		System.out.println("indexOf 'BC': -" + index +"-");
		System.out.println("lastIndexOf 'BC': -" + index2 +"-");
	}
}