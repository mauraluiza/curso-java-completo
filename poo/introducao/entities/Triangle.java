package entities; // Separar as classes por afinidade em pacotes

public class Triangle { // Define a classe Triangulo
	
	// Declara atributos a, b e c da classe Triângulo (public pois podem ser acessados de qualquer arquivo do programa):
	public double a;
	public double b;
	public double c;
	
	// Define o método area:
	public double area() {
		double p = (a + b + c) / 2.0; // Calcula o perímetro do triangulo e armazena o valor em p
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Retorna o resultado do cálculo da area
	}
}
