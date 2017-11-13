package com.icicibank.loans.personalloans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		d.findElement(By.id("u_0_g")).sendKeys("swetha");
		d.findElement(By.id("u_0_g")).clear();
		d.findElement(By.name("reg_email__")).sendKeys("swetha.kutty91@gmail.com");
		String var = d.findElement(By.name("reg_email__")).getAttribute("value");
		System.out.println(var);
		Thread.sleep(1000);
		String tri = d.findElement(By.linkText("Create a Page")).getText();
		System.out.println(tri);
		List<WebElement> j = d.findElements(By.id("email"));
		for(int i=0;i<j.size();i++)
		{
			j.get(i).getText();
			System.out.println("j");
		}
		// TODO Auto-generated method stub

	}

}
