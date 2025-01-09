package entities;

public class Triangle { // define a classe Triangulo
	
	// declara atributos a, b e c da classe Triângulo (public pois podem ser acessados de qualquer arquivo do programa):
	public double a;
	public double b;
	public double c;
	
	// define o método area:
	public double area() {
		double p = (a + b + c) / 2.0; // calcula o perímetro do triangulo e armazena o valor em p
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // retorna o resultado do cálculo da area
	}
}