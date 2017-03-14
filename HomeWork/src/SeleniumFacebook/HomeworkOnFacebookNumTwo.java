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

public class HomeworkOnFacebookNumTwo {

	private WebDriver driver = null;

	// Before class methods execute before each class
	@BeforeClass
	public void beforeClass() {
		System.out.println("Home work #2");
		System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
	}

	// After class method executes after each class
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

//	public void verifyMessage() {
//
//		//String actualValue = driver.findElement(By.linkText("Sign Up")).getText();
//		String actualValue = driver.getTitle();
//		System.out.println(actualValue);
//		String expectedValue = "Sign Up for Facebook | Facebook";
//		Assert.assertEquals(actualValue, expectedValue);
//	}

	@Test
	public void findElementByList() {
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		for (WebElement element : listOfLinks) {
			if (element.getText().equals("Sign Up")) {
				element.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("\n\nPrinting Title\n\n");
				String actualValue = driver.getTitle();
				//System.out.println(actualValue);
				String expectedValue = "Sign Up for Facebook | Facebook";
				Assert.assertEquals(actualValue, expectedValue);
				break;
			}
		}
	}

}
