package entities;

public class Employee {

	// Declara os atributos:
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() { // Método para calcular salário líquido
		return grossSalary - tax; // Retorna o resultado
	}

	public void increaseSalary(double percentage) { // Método para calcular aumento utilizando percentage como parâmetro
		grossSalary += grossSalary * (percentage / 100.00);
	}
	
	public String toString() { // toString para formatar a saída
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
