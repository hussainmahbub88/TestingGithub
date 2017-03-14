package SeleniumFacebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeworkOnFacebookNumThree {
	private WebDriver driver = null;

	// Before class methods execute before each class
	@BeforeClass
	public void beforeClass() {
		System.out.println("Home work #3");
		System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
	}

	// After class method executes after each class
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public void verifyMessage() {

		String actualValue = driver.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[11]/a"))
				.getText();
		System.out.println(actualValue);
		String expectedValue = "Locations";
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test
	public void invalidUsernameAndPass() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("mamun@technosoft.com");
		driver.findElement(By.id("pass")).sendKeys("test1234");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
	}

	@Test
	public void findElementByList() {
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		for (WebElement element : listOfLinks) {
			if (element.getText().matches("Locations")) {
				verifyMessage();
				break;
			}
		}
	}
}
