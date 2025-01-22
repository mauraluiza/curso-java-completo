package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product(); <- O objeto não pode ser instanciado ainda, pois o construtor obriga a inicializar as variáveis com algum valor primeiro
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine(); // Declara uma variável temporária String para receber o valor
		System.out.print("Price: ");
		double price = sc.nextDouble(); // Declara uma variável temporária double para receber o valor
		Product product = new Product(name, price); // Instancia o objeto agora pois seus atributos já tem valores
		
		System.out.println("Product data: " + product);
		
		product.setName("Computer"); // Set permite alterar o valor contido no atributo name
		System.out.println("Updated: " + product.getName()); // Get retorna o valor contido no atributo name
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		product.setPrice(1000.0);
		System.out.println("Updated: " + product.getPrice());
		System.out.println("Product data: " + product);
		
		
		/*System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		*/
		sc.close();
	}
}
