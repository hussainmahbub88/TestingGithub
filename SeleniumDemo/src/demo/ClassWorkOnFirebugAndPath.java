package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassWorkOnFirebugAndPath {
	private WebDriver driver = null;

	// Before class methods execute before each class
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/mamun/workspace/jarlib/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
	}

	// After class method executes after each class
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

//	@Test
//	public void findElementUsingId() throws InterruptedException {
//		driver.findElement(By.id("email")).sendKeys("bobby@technosoft.com");
//		driver.findElement(By.id("pass")).sendKeys("test1234");
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(3000);
//	}
	
	@Test 
	public void findElement(){
		
	}
}
