package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutentificationOutlinePage {
	final static String USER_NAME_XPATH = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]";
	final static String PASSWORD_XPATH = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]";
	final static String LOGIN_XPATH = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]";
	final static String MESSAGE_XPATH = "//header/div[1]/div[1]"; //Dashboard//

	/* @findBy */
	@FindBy(how = How.XPATH, using = USER_NAME_XPATH)
	public static WebElement userName;
	@FindBy(how = How.XPATH, using = PASSWORD_XPATH)
	public static WebElement passWord;
	@FindBy(how = How.XPATH, using = LOGIN_XPATH)
	public static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = MESSAGE_XPATH)
	public static WebElement Dashboard;

	/* Method */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	public void fillPassword(String pswd) {
		passWord.sendKeys(pswd);
	}
	public void clickLoginButton() {
		btnLogin.click();
	}

}
