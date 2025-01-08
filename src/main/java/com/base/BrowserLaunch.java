package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	public WebDriver driver=null;

	public void launchBrowser(int i) {
		
		if(i==1) {
         driver = new ChromeDriver();
         maximize();
		}
		else if(i==2) {
         driver = new FirefoxDriver();
         maximize();
		}
		else
         driver = new EdgeDriver();
		maximize();
       
    }
	
	public void getURL(String url) {
		driver.get(url);
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
}

