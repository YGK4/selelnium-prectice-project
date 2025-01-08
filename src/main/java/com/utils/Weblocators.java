package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Weblocators {
	
	WebDriver driver;
	public Weblocators(WebDriver driver) {
		this.driver = driver;
	}

	
	public void click(By locator) {
		driver.findElement((locator)).click();
	}
	public void enterkeys(By locator, String data) {
		driver.findElement((locator)).sendKeys(data);
	}
	
	public String getText(By locator) {
		return driver.findElement((locator)).getText();
	}
}
