package org.generationcp.bms.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/ibpworkbench/main")
public class LoginPage extends PageObject{

	private static final String USERNAME_TEXTBOX_XPATH = "/html/body/form/div[7]/input";
	private static final String PASSWORD_TEXTBOX_XPATH = "/html/body/form/div[8]/input";
	private static final String SIGNIN_BUTTON_XPATH = "/html/body/form/button";

	public void login(String username, String password) {
		findBy(USERNAME_TEXTBOX_XPATH).type(username);
		findBy(PASSWORD_TEXTBOX_XPATH).type(password);
		findBy(SIGNIN_BUTTON_XPATH).click();
	}
}
