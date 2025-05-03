package util;

public class Calculator {
	
	public static final double PI = 3.14159; // Declaração de uma constante, é final para que não possa ter o valor alterado
	
	public static double circumference(double radius) { // Precisa ser static para que possa ser chamado na main, pois a main também é static (static acessa static)
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) { // Precisa ser static para que possa ser chamado na main, pois a main também é static (static acessa static)
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
