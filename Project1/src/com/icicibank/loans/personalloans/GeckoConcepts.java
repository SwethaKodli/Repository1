package com.icicibank.loans.personalloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//NewDrivers//geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		f.get("https://www.flipkart.com");
		Thread.sleep(5000);
		f.navigate().to("https://amazon.com");
		Thread.sleep(3000);
		f.close();
		// TODO Auto-generated method stub

	}

}
