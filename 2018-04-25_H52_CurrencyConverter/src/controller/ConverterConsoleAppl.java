package controller;

import dto.ApiFixer;
import item.*;
import view.ConsoleInputOutput;
import view.Menu;

public class ConverterConsoleAppl {

	public static void main(String[] args) {

		AbstractItem
				.setLatest(new ApiFixer().getBody());
		
		(new Menu())
			.add(new DisplayAll())
			.add(new DisplayDateOfLatest())
			.add(new ConvertCurrency())
				.addExit()
				.runMenu(new ConsoleInputOutput());
	}

}
