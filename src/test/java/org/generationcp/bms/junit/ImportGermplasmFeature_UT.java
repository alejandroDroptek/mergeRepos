package org.generationcp.bms.junit;

import org.generationcp.bms.steps.serenity.BreederSteps;
import org.generationcp.bms.steps.serenity.NavigationSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ImportGermplasmFeature_UT {

	@Managed
	WebDriver driver;

	@Steps
	BreederSteps breeder;
	@Steps
	NavigationSteps navigator;


	@Test
	public void uploadFileToServer() {
		// GIVEN
		navigator.navigateToPage("Import Germplasm");
		breeder.uploadFile("parentalGermplasm.xls");


		// WHEN


		// THEN

	}

}
