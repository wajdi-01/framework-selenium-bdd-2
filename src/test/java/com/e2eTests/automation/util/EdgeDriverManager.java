package com.e2eTests.automation.util;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager  {
	@Override
	protected void startService() {
		System.setProperty("webdriver.edge.driver", "");
	}

	@Override
	protected void stopService() {

	}

	protected void createDriver() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
}


