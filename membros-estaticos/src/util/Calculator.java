package util;

public class Calculator {
	
	public static final double PI = 3.14159; // Declaração de uma constante, é final para que não possa ter o valor alterado
	
	public static double circumference(double radius) { // precisa ser static para que possa ser chamado na main, pois a main também é static
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}