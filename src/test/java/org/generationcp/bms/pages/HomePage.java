package org.generationcp.bms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.google.common.base.Optional;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject implements IBPPage{

	public static final String USER_LABEL_XPATH =
			"//*[@id=\"ibpworkbenchmain-2128183583\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[8]/div/div/span/span/span/span[1]";
	public static final String USER_DETAILS_BUTTON_XPATH =
			"//*[@id=\"ibpworkbenchmain-2128183583\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[8]/div/div";
	public static final String SIGN_OUT_BUTTON_XPATH = "/html/body/div[3]/div/div/div/div[2]/div/div";
	public static final String ADD_PROGRAM_BUTTON_XPATH =
			"//*[@id=\"ibpworkbenchmain-2128183583\"]/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div";




	public Optional<String> getUserName() {
		try{
			WebElementFacade userLabel = find(By.xpath(USER_LABEL_XPATH));
			return Optional.fromNullable(userLabel.getText());
		}catch (NoSuchElementException ex){
			ex.printStackTrace();
		}
		return Optional.absent();

	}

	public void showUserDetails(){
		WebElementFacade userButton = find(By.xpath(USER_DETAILS_BUTTON_XPATH));
		userButton.click();
	}

	public void logout(){
		showUserDetails();
		WebElementFacade signOutButton = find(By.xpath(SIGN_OUT_BUTTON_XPATH));
		signOutButton.click();

	}

	@Override
	public boolean isPageDisplayed() {
		WebElementFacade addProgramButton = find(By.xpath(ADD_PROGRAM_BUTTON_XPATH));;
		return addProgramButton.isDisplayed();
	}
}
