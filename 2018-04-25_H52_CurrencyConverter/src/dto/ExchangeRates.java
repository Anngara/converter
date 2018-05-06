package dto;

import java.util.Map;

public class ExchangeRates {
	public String base;
	public String date;
	public Map <String, Double> rates;

	public String getDate() {
		return date;
	}

	public Map<String, Double> getRates() {
		return rates;
	}



	public String getBase() {
		return base;
	}

	@Override
	public String toString() {
		return "ExchangeRates [base=" + base + ", date=" + date + ", rates=" + rates + "]";
	}
	
}
