package com.icicibank.loans.personalloans;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Drivers//edgedriver.exe")
		EdgeDriver e=new EdgeDriver();
		e.get("https://www.yahoo.com");
		// TODO Auto-generated method stub

	}

}
