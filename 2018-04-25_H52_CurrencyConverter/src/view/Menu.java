package view;

import java.util.ArrayList;



public class Menu {
	private static final String CHOICE = "Enter menu item ?> ";
	ArrayList<Item> items;
	ConsoleInputOutput consInOut; 

	
	
	public Menu() {
		this.items= new ArrayList <Item>();
		}
	
	public Menu add (Item i) {
		items.add(i);
		return this;
	}
	public Menu addExit () {
		items.add(new ExitItem());
		return this;
	}
	

	public void runMenu(ConsoleInputOutput  consInOut) {
		this.consInOut = new ConsoleInputOutput();
		int c;
		do {
			consInOut.displayLine("");
			consInOut.displayLine("------  MENU  ------");
			for (int i = 1; i <= items.size(); i++) {
				consInOut.displayLine(i + "." + items.get(i - 1).displayName());
			}
			consInOut.displayLine("---------------------");

			c = consInOut.getInteger(CHOICE, 1, items.size() + 1);
			items.get(c - 1).action(consInOut);
		} while (!items.get(c - 1).isExit());
	}

	

}
