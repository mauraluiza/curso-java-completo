package entities;

public class Product {

	// Atributos da classe:
	public String name;
	public double price;
	public int quantity;

	// Métodos da classe:
	public double totalValueInStock() { // Calcular valor total em estoque
		return price * quantity;
	}
	
	public void addProducts(int quantity) { // Adiciona produtos ao estoque utilizando atributo quantity como parâmetro
		this.quantity += quantity;
	}
	 
	public void removeProducts(int quantity) { // Remove produtos do estoque utilizando atributo quantity como parâmetro
		this.quantity -= quantity;
	}
	
	public String toString() { // toString é um método da classe String capaz de formatar a saída de dados quando identifica um comando de saída na main
		return name // Retorna a seguinte formatação na variável name quando dentro de um print
				+", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}
