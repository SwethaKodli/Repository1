package com.icicibank.loans.personalloans;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.findElement(By.id("lst-ib")).sendKeys("Wikipedia");
		// TODO Auto-generated method stub
        String f = d.findElement(By.id("lst-ib")).getAttribute("value");
        System.out.println(f);
	}

}
