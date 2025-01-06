package logicaprogramacao;

public class Casting1 {
	public static void main(String[] args) {
		
		int a, b;
		double r;
		
		a = 5;
		b = 2;
		
		r = (double) a / b;     // Casting permite a conversão dos dados int para double para que não haja perda na divisão por inteiros
		
		System.out.print(r);
		
	}
}
