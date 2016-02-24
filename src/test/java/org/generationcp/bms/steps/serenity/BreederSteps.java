package org.generationcp.bms.steps.serenity;

import org.generationcp.bms.pages.ImportGermplasmPage;

import net.thucydides.core.steps.ScenarioSteps;

public class BreederSteps extends ScenarioSteps{

	ImportGermplasmPage importGermplasmPage;

	public void uploadFile(String filename) {
		importGermplasmPage.upload("upload/"+filename);
	}
}
