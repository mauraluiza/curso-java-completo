package entities;

public class Product {
	
	
	// Encapsulamento: protege o conteúdo dos atributos tornando privados (inacessíveis para outras classes)
	private String name;
	private double price;
	private int quantity;
	
	// Sobrecarga: utiliza mesmo nome de um elemento para definições diferentes, são diferenciados na main pelo parâmetro
	
	public Product() { // Construtor padrão, não obirga a inicializar seus atributos antes de instanciar objetos
	}
	
	public Product(String name, double price, int quantity) { // Construtor que obriga a inicializar todos os atributos antes de instanciar um objeto
		this.name = name; // this referencia a variável da classe, não do método
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // Construtor que obriga a inicializar apenas atributos name e price antes de instanciar um objeto
		this.name = name; 
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	// Encapsulamento: com o atributo privado, o método público não corre risco de erros por valores incorretos
	
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