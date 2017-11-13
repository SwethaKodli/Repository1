package com.icicibank.loans.personalloans;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		c.manage().window().maximize();
		String actval = c.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/button")).getAttribute("innerHTML");
		String exptval = "Forgot Email?";
		System.out.println(actval);
		System.out.println(exptval);
		if (actval.equals(exptval))
			System.out.println("Values are equal");
			else
			{
			System.out.println("Values are not equal");
		}
		//(or use the below code)
		if (actval.equalsIgnoreCase(exptval))
			System.out.println("Values are equal");
		else
			System.out.println("Values are not equal");
	}

}
