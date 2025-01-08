package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionMethods {

	
		public void click(WebDriver driver, By locator) {
	        driver.findElement(locator).click();
	}

		public void sendKeys(WebDriver driver, By locator, String text) {
		    driver.findElement(locator).sendKeys(text);
		}

	

	public void getText() {
	}

	public void getAttribute() {
	}

	public void select() {
	}

	public void hover() {
	}

	public void rightClick() {
	}

	public void doubleClick() {
	}

	public void dragAndDrop() {
	}

	public void scroll() {
	}

	public void switchToFrame() {
	}

	public void switchToWindow() {
	}

	public void switchToAlert() {
	}

	public void acceptAlert() {
	}

	public void dismissAlert() {
	}

	public void sendKeysAlert() {
	}

	public void getAlertText() {
	}

	public void switchToDefaultContent() {
	}

	public void uploadFile() {
	}

	public void downloadFile() {
	}

	public void waitUntil() {
	}

	public void waitUntilText() {
	}

	public void waitUntilValue() {
	}

	public void waitUntilAttribute() {
	}

	public void waitUntilTitle() {
            
}
}
