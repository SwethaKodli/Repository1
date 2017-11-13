package com.icicibank.loans.personalloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		InternetExplorerDriver i=new InternetExplorerDriver();
		i.get("https://www.oracle.com");
	
		// TODO Auto-generated method stub

	}

}
