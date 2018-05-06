package item;

import view.InputOutput;
import view.Item;

public class DisplayDateOfLatest extends AbstractItem {

	@Override
	public String displayName() {
		return "Display date of the latest request to the service";
	}

	@Override
	public void action(InputOutput inOut) {
		System.out.println("Date of the latest request to the service: " + latestRequest.getDate());
	}

}
