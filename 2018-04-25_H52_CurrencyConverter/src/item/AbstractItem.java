package item;

import dto.ExchangeRates;
import view.Item;

public abstract class AbstractItem implements Item {
	static protected ExchangeRates latestRequest;

	public static ExchangeRates getLatestRequest() {
		return latestRequest;
	}

	public static void setLatest(ExchangeRates latest) {
		AbstractItem.latestRequest = latest;
	}
	
}
