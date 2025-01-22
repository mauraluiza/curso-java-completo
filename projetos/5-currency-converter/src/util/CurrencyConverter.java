package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double toPay(double dollarPrice, double dollarAmount) {
		return dollarPrice = (IOF + 1.0) * dollarPrice * dollarAmount;
	}
}