package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	 
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // toString é um método da classe String capaz de formatar a saída de dados quando identifica um comando de saída na main
		return name // retorna a seguinte formatação na variável name quando dentro de um print
				+", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}
