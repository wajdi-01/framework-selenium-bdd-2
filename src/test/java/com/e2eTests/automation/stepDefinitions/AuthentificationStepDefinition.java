package com.e2eTests.automation.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods {

	public WebDriver driver = null;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^J ouvre lapplication orangeHRM$")
	public void jOuvreLapplicationOrangeHRM() throws Throwable {
		logger.info("J ouvre lapplication orangeHRM");
		commonMethods.readFromConfigFile("url");

	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
		logger.info("Je saisie le login");
		PageFactory.initElements(driver, AuthentificationPage.class);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		authentificationPage.fillUserName();

	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		logger.info("Je saisie le mot de passe");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		authentificationPage.fillPassWord();

	}

	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		logger.info("Je clique sur le boutton login");
		authentificationPage.clicLoginBtn();

	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
		logger.info("Je verifie le compte admin");
		String text = AuthentificationPage.Dashboard.getText();
		Assert.assertTrue(text.contains("Dashboard"));

	}

}
