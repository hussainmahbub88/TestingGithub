package com.facebook.SeleniumMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SimpleTest extends WebDriverFactory{

	@Test
	public void TestOne() throws InterruptedException{
		//System.out.println("Hello");
		LandingPage landingPage = new LandingPage();
		landingPage.enterEmail("test@test.com");
		landingPage.enterPassword("test123");
		landingPage.clickOnButton();
		Thread.sleep(5000);
		//Verify Error Message
	}
}
