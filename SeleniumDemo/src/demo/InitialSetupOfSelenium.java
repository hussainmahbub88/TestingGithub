package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InitialSetupOfSelenium {
	private WebDriver driver = null;

	// Before class methods execute before each class
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
	}

	// After class method executes after each class
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void findElementUsingId() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("bobby@technosoft.com");
		driver.findElement(By.id("pass")).sendKeys("test1234");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
	}
}
