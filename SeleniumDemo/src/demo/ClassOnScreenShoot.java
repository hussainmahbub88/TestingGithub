package demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ClassOnScreenShoot extends WebDriverFactory {

//	Showing how to navigate the browser 
//	@Test
//	public static void navigation() {
//		getDriver().navigate().forward();
//		getDriver().navigate().back();
//		getDriver().navigate().refresh();
//	}

	private static void takeScreenshot(String fileName) {
		try {
			File scr = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr, new File("/Users/mamun/workspace/SeleniumDemo/src" + fileName + ".jpg"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	@Test
	public static void screenshotExample(){
		try {
			getDriver().findElement(By.id("someJunk")).click();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Tasnia");
			takeScreenshot("screenshot2");
			e.printStackTrace();
			throw new NoSuchElementException("Specified Element Not Found");
		}
	}

}
