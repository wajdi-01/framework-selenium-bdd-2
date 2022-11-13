package com.e2eTests.automation.util;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {
	
	public CommonMethods() {
		driver = Setup.driver;
	}

	public static WebDriver driver;
	public static Properties prop;
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);     //import loger (org.slf4g)

	public void scrollBottom() {
		((JavascriptExecutor) driver).executeScript("winfow.scrollBy(0.400)", "");
	}

	public void readFromConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.proprties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}
}
