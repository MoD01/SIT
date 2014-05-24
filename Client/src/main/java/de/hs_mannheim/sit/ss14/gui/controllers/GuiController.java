package de.hs_mannheim.sit.ss14.gui.controllers;

import de.hs_mannheim.sit.ss14.gui.models.*;
import de.hs_mannheim.sit.ss14.gui.view.*;

/**
 * Hier wird die View gestarted und die Models erstellt.
 * 
 * @author DS
 * 
 */
public class GuiController {
	public StartView startView;


	GuiController() {
		startView();
	}

	public void startView() {
		startView = new StartView(new LoginModel(), new LoginController(this),
				new RegisterModel(), new RegisterController());
	}

	public static void main(String args[]) {
		new GuiController();
	}
}
