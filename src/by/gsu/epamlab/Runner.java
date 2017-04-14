package by.gsu.epamlab;

import by.gsu.epamlab.ws.ConverterImpl;
import by.gsu.epamlab.ws.ConverterImplPortType;

public class Runner {

	public static void main(String[] args) {
		ConverterImplPortType service = new ConverterImpl().getConverterImplPort();	
		double amount1 = 9.57;
		double amount2 = 13.74;
		double amount3 = 233.64;
		double amount4 = 644.21;
		String eur = "EUR";
		String usd = "USD";
		String rub = "RUB";
		String byn = "BYN";
		
		System.out.println(conversion(service, amount1, eur, usd));
		System.out.println(conversion(service, amount2, usd, rub));
		System.out.println(conversion(service, amount3, eur, rub));
		System.out.println(conversion(service, amount4, byn, rub));
	}
	
	static String conversion(ConverterImplPortType service, double amount, String fromCurrency, String toCurrency) {
		double multiplier = service.conversionRate(fromCurrency, toCurrency);
		return amount + fromCurrency + " = " + String.format("%.2f", amount * multiplier) + toCurrency + ",\nConversion rate = " + multiplier + "\n";			
	}

}