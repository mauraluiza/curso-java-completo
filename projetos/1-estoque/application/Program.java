// PROJETO 1: Sistema simples de controle de estoque com funções de adicionar e remover produtos.

package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); // Instancia novo objeto (produto)

		// Informa atributos do objeto produto (nomre, preço, quantidade):
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product); // Imprime informações do produto
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: "); // Adiciona quantidade x de produtos ao estoque
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product); // Imprime informações atualizadas do produto
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: "); // Remove quantidade x de produtos do estoque
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product); // Imprime informações atualizadas do produto
		sc.close();
	}
}
