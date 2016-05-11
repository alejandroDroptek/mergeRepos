package org.generationcp.bms.steps;

import org.generationcp.bms.steps.serenity.NavigationSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	@Steps
	NavigationSteps navigationSteps;



	@Given("^BMS is launched in my browser$")
	public void bms_is_launched_in_my_browser() throws Throwable {
		navigationSteps.openApp();
		if(navigationSteps.isUserLoggedIn()){
			navigationSteps.logout();
		}
	}

	@When("^I log in as a breeder '(.*)' password '(.*)'$")
	public void i_log_in_as_a_breeder(String username, String password) throws Throwable {
		navigationSteps.login(username, password);
	}

	@Then("^I should see the (.*) page$")
	public void i_should_see_the_screen(String page) throws Throwable {

		navigationSteps.shouldSeePage(page);
	}

}
