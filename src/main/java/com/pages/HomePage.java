package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.locators.Homelocator;
import com.utils.Weblocators;

public class HomePage extends Weblocators {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void ClickRegisterButton() {
		click(By.xpath(Homelocator.RegisterButton));
	}

}
