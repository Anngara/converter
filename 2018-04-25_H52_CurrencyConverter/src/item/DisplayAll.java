package item;

import view.InputOutput;

public class DisplayAll extends AbstractItem {

	@Override
	public String displayName() {
		return "Display all currency codes";
	}

	@Override
	public void action(InputOutput inOut) {
		latestRequest.getRates().keySet().forEach(x->System.out.printf(x+" "));
		System.out.println();
	}

}
