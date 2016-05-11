package org.generationcp.bms;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources/features/login.feature","src/test/resources/features/import_germplasm.feature"})
public class ImportGermplasm {

}
