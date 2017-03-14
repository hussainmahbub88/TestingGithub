package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorkOnFacebook {

	private WebDriver driver = null;
	private String errorMessage = "js_1";
	
	/*Home work #1
	Step 1. Enter invalid username
	Step 2. Enter invalid password 
	Step 3. Click on Login button
	Step 4: Verify expected error message as "The email you've entered doesn't match any account. Sign up for an account."*/
	   	
	// Before class methods execute before each class
		@BeforeClass
		public void beforeClass() {
			System.out.println("Home work #1");
			System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
			driver = new FirefoxDriver();
			driver.navigate().to("http://facebook.com");
		}
		
		// After class method executes after each class
		@AfterClass
		public void afterClass() {
			//driver.quit();
		}
		
		public void verifyMessage(){
			
			String actualValue = driver.findElement(By.id(errorMessage)).getText();
			String expectedValue = "The email you’ve entered doesn’t match any account. Sign up for an account.";
			Assert.assertEquals(actualValue, expectedValue);
		}
		@Test
		public void invalidUsernameAndPass() throws InterruptedException {
			driver.findElement(By.id("email")).sendKeys("mamun@technosoft.com");
			driver.findElement(By.id("pass")).sendKeys("test1234");
			driver.findElement(By.id("loginbutton")).click();
			//Thread.sleep(1000);
			verifyMessage();
			
			
		}
}
