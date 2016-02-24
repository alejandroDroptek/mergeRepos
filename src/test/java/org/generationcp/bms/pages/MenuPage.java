package org.generationcp.bms.pages;

import java.util.HashMap;
import java.util.Map;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MenuPage extends PageObject {

	public static final String TOGGLE_BUTTON_XPATH =
			"//*[@id=\"ibpworkbenchmain-2128183583\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div/div";
	public static final String IMPORT_GERMPLASM_LINK_XPATH =
			"//*[@id=\"ibpworkbenchmain-2128183583\"]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div[1]/div[1]";
	private static Map<String, String> linkMap;

	public void displaySideBar() {
		waitFor(5000);
		WebElementFacade sidebar = findBy(".bms-sidebarcontent");

		if(!sidebar.isDisplayed()){
			WebElementFacade toggleButton = findBy(TOGGLE_BUTTON_XPATH);
			toggleButton.click();
		}

		if(MenuPage.linkMap == null){
			MenuPage.linkMap = new HashMap<String,String>();
			linkMap.put("IMPORT GERMPLASM",IMPORT_GERMPLASM_LINK_XPATH);
		}
	}

	public void navigateToPage(String page) {
		WebElementFacade link = findBy(linkMap.get(page.toUpperCase()));
		link.click();
	}
}
