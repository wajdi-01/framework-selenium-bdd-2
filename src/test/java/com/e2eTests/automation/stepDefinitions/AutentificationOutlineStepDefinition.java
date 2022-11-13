package com.e2eTests.automation.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AutentificationOutlinePage;
import com.e2eTests.automation.pageObjects.AuthentificationPage;
import com.e2eTests.automation.util.CommonMethods;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutentificationOutlineStepDefinition {

	public WebDriver driver;

	private CommonMethods commonMethods = new CommonMethods();
	private AutentificationOutlinePage autentificationOutlinePage = new AutentificationOutlinePage();

	public AutentificationOutlineStepDefinition() {
		driver = Setup.driver;
		
	}

	@Given("^J me connecte lapplication orangeHRM$")
	public void jOuvreLapplicationOrangeHRM() throws Throwable {
		commonMethods.readFromConfigFile("url");

	}

	@When("^Je saisie le login \"([^\"]*)\"$")
	public void jeSaisieLeLogin(String name) throws Throwable {
		PageFactory.initElements(driver, AutentificationOutlinePage.class);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		autentificationOutlinePage.fillUserName(name);

	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String pswd) throws Throwable {
		autentificationOutlinePage.fillPassword(pswd);
	}

	@When("^Je clique sur  login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		autentificationOutlinePage.clickLoginButton();

	}

	@Then("^redirection ver  le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		String text = AuthentificationPage.Dashboard.getText();
		Assert.assertTrue(text.contains("Dashboard"));

	}

}
