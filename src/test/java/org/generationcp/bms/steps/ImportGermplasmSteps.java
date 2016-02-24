package org.generationcp.bms.steps;

import org.generationcp.bms.steps.serenity.BreederSteps;
import org.generationcp.bms.steps.serenity.NavigationSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ImportGermplasmSteps extends ScenarioSteps {

	@Steps
	NavigationSteps navigationSteps;
	@Steps
	BreederSteps breederSteps;



	@Given("^I am in the (.*) page$")
	public void i_am_in_page(String page) throws Throwable {
		navigationSteps.navigateToPage(page);
	}


	@Given("^I upload (.*) excel file$")
	public void i_upload_excel_file(String filename) throws Throwable {
		breederSteps.uploadFile(filename);
	}

	@Then("^Then I should see Import Germplasm dialog$")
	public void i_should_see_the_screen(String page) throws Throwable {

		navigationSteps.shouldSeePage(page);
	}

}
