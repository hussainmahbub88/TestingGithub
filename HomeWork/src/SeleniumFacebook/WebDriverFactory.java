package SeleniumFacebook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverFactory {

	private static WebDriver driver = null;
	private static final String URL = "http://facebook.com";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}
}
