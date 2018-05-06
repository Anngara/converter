package item;

import java.time.LocalDate;

import dto.ApiFixer;
import dto.ExchangeRates;
import view.InputOutput;

public class ConvertCurrency extends AbstractItem{

	@Override
	public String displayName() {
		return "Convert currency";
	}

	@Override
	public void action(InputOutput inOut) {
		
		String from = getCode(inOut,"Getting currency code from->");
		String to = getCode(inOut,"Getting currency code to->");
		double amount = inOut.getDouble("Getting amount->");
		LocalDate newDateRequest = inOut.getDate("Getting date if no latest->" );
		System.out.println(newDateRequest);
		double res;
		//if (newDateRequest==null) {
			res = convert (from, to, amount, latestRequest);
		/*}else {
			res = convert (from, to, amount, new ApiFixer(newDateRequest).getBody());
		}*/
		System.out.println(amount + " " + from + " = " + res + " " + to);
		
	}
	
	private String getCode (InputOutput inOut, String message) {
		String code;
		do{
			code = inOut.getString(message);
		}while (latestRequest.getRates().containsKey(code)!=true);
		return code;
	}
		
	private double convert (String from, String to, double amount, ExchangeRates request) {
		return  amount * request.getRates().get(from) / request.getRates().get(to);
}
}