package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomXpathDemo {

	private WebDriver driver = null;

	// Before class methods execute before each class
	@BeforeClass
	public void beforeClass() {
		System.out.println("Home work #3");
		System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");
	}

	// After class method executes after each class
	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
	
	@Test
	public void clickOn() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@class='jsb']/descendant::input[position()=2]")).click();
		Thread.sleep(5000);
	}
}
