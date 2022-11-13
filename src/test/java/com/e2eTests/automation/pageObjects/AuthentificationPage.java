package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {

	final static String USER_NAME_NAME = "username"; 
	final static String PASSWORD_NAME = "password";
	final static String LOGIN_XPATH = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]";
	final static String MESSAGE_XPATH = "//header/div[1]/div[1]"; 

	/* @findBy */
	@FindBy(how = How.NAME, using = USER_NAME_NAME)
	public static WebElement userName;
	@FindBy(how = How.NAME, using = PASSWORD_NAME)
	public static WebElement passWord;
	@FindBy(how = How.XPATH, using = LOGIN_XPATH)
	public static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = MESSAGE_XPATH )
	public static WebElement Dashboard; 

	/* Method */
	public void fillUserName() {
		userName.sendKeys("Admin");
	}

	public void fillPassWord() {
		passWord.sendKeys("admin123");

	}

	public void clicLoginBtn() {
		btnLogin.click();
	}

}
