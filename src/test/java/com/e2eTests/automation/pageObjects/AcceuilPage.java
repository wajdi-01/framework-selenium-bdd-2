package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AcceuilPage {
	
	final static String BUTTON_RECRUITEMENT = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]/span[1]";
	final static String PAGE_RERUITEMENT = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]";
	final static String BUTTON_PIM = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]";
	final static String PAGE_PIM = "//header/div[2]/nav[1]/ul[1]/li[1]";
	

	/* @findBy */
	@FindBy(how = How.XPATH, using = BUTTON_RECRUITEMENT)
	public static WebElement btnRecruitement;
	@FindBy(how = How.XPATH, using = PAGE_RERUITEMENT)
	public static WebElement pageRecruitement;
	@FindBy(how = How.XPATH, using = BUTTON_PIM)
	public static WebElement btnPIM;
	@FindBy(how = How.XPATH, using = PAGE_PIM)
	public static WebElement pagePIM;
	
	/* Method */
	public void goToRecruitement() {
		btnRecruitement.click();
	}
	public void goToPIM() {
		btnPIM.click();
	}
	
	
 
}
