package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BrowserLaunch;
import com.pages.HomePage;
import com.pages.RegistrationPage;

public class RegistrationAndLoginTest extends BrowserLaunch {

	RegistrationPage rp = null;
	HomePage hp = null;

	@Test
	public void verifyUserRegistration() {
		
		launchBrowser(1);
		driver.get("http://demowebshop.tricentis.com/");
		
		hp = new HomePage(driver);
		
		hp.ClickRegisterButton();
		
		rp = new RegistrationPage(driver);
		
		rp.SelectGender();
		rp.EnterFirstName();
		rp.EnterLastName();
		rp.EnterEmail1();
		rp.EnterPassword();
		rp.EnterConfirmPassword();
		rp.ClickRegister();
		Assert.assertEquals(rp.verifyUserRegistration(), "Your registration completed");
		
	}
	
	@Test
	public void verifyEmailalreadyPresentn() {
		
		launchBrowser(1);
		driver.get("http://demowebshop.tricentis.com/");
		
		hp = new HomePage(driver);
		
		hp.ClickRegisterButton();
		
		rp = new RegistrationPage(driver);
		
		rp.SelectGender();
		rp.EnterFirstName();
		rp.EnterLastName();
		rp.EnterEmail1();
		rp.EnterPassword();
		rp.EnterConfirmPassword();
		rp.ClickRegister();
		Assert.assertEquals(rp.verifyEmailalreadyPresent(), "The specified email already exists");
	}
}
