package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.e2eTests.automation.pageObjects.AcceuilPage;
import com.e2eTests.automation.util.Setup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcceuilStepDefinition {

	public WebDriver driver;
	private AcceuilPage acceuilPage = new AcceuilPage();

	public AcceuilStepDefinition() {
		driver = Setup.driver;

	}

	@When("^je clique sur le module Recruitment$")
	public void jeCliqueSurLeModuleRecruitment() throws Throwable {
		PageFactory.initElements(driver, AcceuilPage.class);
		acceuilPage.goToRecruitement();
	}

	@Then("^je verifie l affichage de la page Recruitment \"([^\"]*)\"$") // imported from outlinestepdefinition

	public void jeVerifieLAffichageDeLaPageRecruitment(String sub_menu_rec) throws Throwable {
		String pageRecruitement = AcceuilPage.pageRecruitement.getText();
		Assert.assertTrue(pageRecruitement.contains(sub_menu_rec));
	}

	@When("^je clique sur le module PIM$")
	public void jeCliqueSurLeModulePIM() throws Throwable {
		PageFactory.initElements(driver, AcceuilPage.class);
		acceuilPage.goToPIM();
	}

	@Then("^je verifie l affichage de la page PIM \"([^\"]*)\"$") // imported from outlinestepdefinition "\"([^\"]*)\""
	public void jeVerifieLAffichageDeLaPagePIM(String sub_menu_PIM) throws Throwable {
		String pagePIM = AcceuilPage.pagePIM.getText();
		Assert.assertTrue(pagePIM.contains(sub_menu_PIM));
	}

}
