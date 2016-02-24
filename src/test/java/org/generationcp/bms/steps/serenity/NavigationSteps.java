package org.generationcp.bms.steps.serenity;

import java.util.HashMap;

import org.generationcp.bms.pages.HomePage;
import org.generationcp.bms.pages.IBPPage;
import org.generationcp.bms.pages.ImportGermplasmPage;
import org.generationcp.bms.pages.LoginPage;
import org.generationcp.bms.pages.MenuPage;

import com.google.common.base.Optional;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;
import static org.fest.assertions.Assertions.assertThat;

public class NavigationSteps extends ScenarioSteps {

	public static final String HOME = "PROGRAM DASHBOARD";
	public static final String LOGIN = "LOGIN";
	public static final String IMPORT_GEMPLASM = "IMPORT GEMPLASM";

	LoginPage loginPage;
	HomePage homePage;
	ImportGermplasmPage importGermplasmPage;
	MenuPage menuPage;

	private HashMap<String, PageObject> pageMap;


	private void loadNavigationScreens() {
		this.pageMap = new HashMap<String, PageObject>();
		pageMap.put(HOME,homePage);
		pageMap.put(LOGIN,loginPage);
		pageMap.put(IMPORT_GEMPLASM,importGermplasmPage);

	}

	@Step("Go to landing page")
	public void openApp() {
		if(this.pageMap == null){
			loadNavigationScreens();
		}
		loginPage.open();
	}

	@Step("Check if user is logged in")
	public boolean isUserLoggedIn() {
		Optional<String> username = homePage.getUserName();
		return username.isPresent();
	}
	@Step("Logout")
	public void logout() {
		homePage.logout();
	}
	@Step("Insert user and password then signin")
	public void login(String username, String password) {
		loginPage.login(username,password);
	}

	@Step("Check this is the expected page")
	public void shouldSeePage(String page) {
		PageObject pageObject = pageMap.get(page.toUpperCase());
		assertThat(((IBPPage)pageObject).isPageDisplayed()).isTrue();
	}

	@Step("Navigate to expected page")
	public void navigateToPage(String page) {

		menuPage.displaySideBar();
		menuPage.navigateToPage(page);
	}
}
