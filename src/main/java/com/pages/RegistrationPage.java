package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.locators.RegistrationLocator;
import com.utils.Weblocators;

public class RegistrationPage extends Weblocators {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void SelectGender() {
		click(By.xpath(RegistrationLocator.Male));
	}

	public String verifyUserRegistration() {
		return getText(By.className(RegistrationLocator.RegistrationSuccess));
	}

	public String verifyEmailalreadyPresent() {
		return getText(By.className(RegistrationLocator.EmailalreadyPresent));
	}

	public void EnterFirstName() {
		driver.findElement(By.xpath(RegistrationLocator.FirstName)).sendKeys("Barney");
	}

	public void EnterLastName() {
		driver.findElement(By.xpath(RegistrationLocator.Lastname)).sendKeys("Stinson");
	}

	public void EnterEmail1() {
		driver.findElement(By.xpath(RegistrationLocator.Email)).sendKeys("test1122@mailnator.com");
	}

	public void EnterPassword() {
		driver.findElement(By.xpath(RegistrationLocator.Password)).sendKeys("Barney@123");
	}

	public void EnterConfirmPassword() {
		driver.findElement(By.xpath(RegistrationLocator.ConfirmPassword)).sendKeys("Barney@123");
	}

	public void ClickRegister() {
		driver.findElement(By.xpath(RegistrationLocator.Register)).click();
	}
}
