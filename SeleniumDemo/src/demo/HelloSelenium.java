package demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class HelloSelenium {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args)  throws Exception{
		//System.setProperty("webdriver.chrome.driver", "/Users/mamun/workspace/jarlib/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/mamun/Downloads/geckodriver");
		System.setProperty("webdriver.safari.driver", "/Applications/Safari.app ");
		
		
//		driver = new ChromeDriver();
//		driver.navigate().to("http://facebook.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.quit();
//		driver.close();
		
//		driver = new FirefoxDriver();
//		driver.navigate().to("http://google.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.quit();
		
		driver = new SafariDriver();
		driver.get("http://google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
		
		
		
/*		File pathBinary = new File("/Users/mamun/Downloads/geckodriver");
		FirefoxBinary Binary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxPro = new FirefoxProfile();
		driver = new FirefoxDriver(Binary, firefoxPro);
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, firefoxPro);
		driver.get("https://www.google.com/");*/
		
		
	}

}
