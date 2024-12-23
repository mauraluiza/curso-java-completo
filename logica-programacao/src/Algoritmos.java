import java.util.Scanner;

public class Algoritmos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hInicio = sc.nextInt();
		int hFim = sc.nextInt();
		
		if (hInicio > hFim) {
			System.out.println("O jogo durou " + ((24 - hInicio) + hFim) + " horas.");
		}
		else if (hFim > hInicio){
			System.out.println("O jogo durou " + (hFim - hInicio) + " horas.");
		}
		else {
			System.out.println("O jogo durou 24 horas.");
		}
		
		sc.close();
	}
}