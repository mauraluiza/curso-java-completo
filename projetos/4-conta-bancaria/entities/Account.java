package entities;

public class Account {

	// Declara atributos com visibilidade private para que sejam acessados somente por getters/setters (encapsulamento)
	private int number;
	private String holder;
	private double value;
	
	public Account(int number, String holder, double initial) { // Construtor padrão que exige informações de atributos ao instanciar um objeto
		this.number = number;
		this.holder = holder;
		deposit(initial);
	}
	
	public double getValue() { // getter para visualizar valor
		return value;
	}
	
	public double deposit(double qtd) { // Método para depósito que utiliza qtd como parâmetro
		return value = value + qtd;
	}
	
	public double withdraw(double qtd) { // Método para saque que utiliza qtd como parâmetro
		return value = value - qtd - 5;
	}
	
	public String toString() { // toString para formatar a saída
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", value);
	}
}
