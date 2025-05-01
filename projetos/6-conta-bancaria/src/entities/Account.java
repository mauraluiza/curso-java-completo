package entities;

public class Account {
	
	private int number;
	private String holder;
	private double value;
	
	public Account(int number, String holder, double initial) {
		this.number = number;
		this.holder = holder;
		deposit(initial);
	}
	
	public double getValue() {
		return value;
	}
	
	public double deposit(double qtd) {
		return value = value + qtd;
	}
	
	public double withdraw(double qtd) {
		return value = value - qtd - 5;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", value);
	}
}
