package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowHandler extends WebDriverFactory{
	public static void switchToWindow(int index){
		List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(listOfWindows.get(index));
	}
	
	public static void switchToRootWindowAndCloseCurrentBrowser(){
		List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());
		
		for (int i =1; i < listOfWindows.size(); i++){
			getDriver().switchTo().window(listOfWindows.get(i));
			getDriver().close();
		}
		getDriver().switchTo().window(listOfWindows.get(0));
	}
	
	@Test 
	public void sampleSwitchWindowScenario() throws InterruptedException{
		getDriver().findElement(By.cssSelector("#privacy-link")).click();
		Thread.sleep(2000);
		switchToWindow(1);
		Thread.sleep(2000);
		getDriver().findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		switchToRootWindowAndCloseCurrentBrowser();
		Thread.sleep(2000);
	}
}
