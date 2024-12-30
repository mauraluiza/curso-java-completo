import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 06: Programa que calcula área de diversas formas geométricas
		 * com base em valores A, B e C informados pelo usuário.		 
		 */
		
		Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();

        // Área do triângulo:
        double aTriangulo = (A * C) / 2;

        // Área do círculo:
        double pi = 3.14159;
        double aCirculo = pi * C * C;

        // Área do trapézio:
        double aTrapezio = ((A + B) * C) / 2;

        // Área do quadrado:
        double aQuadrado = B * B;

        // Área do retângulo:
        double aRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", aTriangulo);
        System.out.printf("CIRCULO: %.3f\n", aCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", aTrapezio);
        System.out.printf("QUADRADO: %.3f\n", aQuadrado);
        System.out.printf("RETANGULO: %.3f\n", aRetangulo);
	}

}
