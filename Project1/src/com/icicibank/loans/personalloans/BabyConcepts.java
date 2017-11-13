package com.icicibank.loans.personalloans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BabyConcepts{


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.facebook.com");
	d.navigate().to("https://www.gmail.com");
		// TODO Auto-generated method stub
	d.manage().window().maximize();
	d.findElement(By.linkText("")).click();
	d.manage().deleteAllCookies();
	d.navigate().back();

	Thread.sleep(4000);
	d.navigate().forward();
	Thread.sleep(6000);
	d.navigate().refresh();
	String a = d.getTitle();
	System.out.println(a);
	String b = d.getCurrentUrl();
	System.out.println(b);
	d.close();
	}

}
