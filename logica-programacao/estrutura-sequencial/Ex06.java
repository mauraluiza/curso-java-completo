package estruturasequencial;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * Exercício 06 (URI 1012): Fazer um programa que leia três valores com ponto flutuante
		 * de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		 * 
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B	. 
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
