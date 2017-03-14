package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverOver extends WebDriverFactory{

	@Test
	public static void mouseOver() throws InterruptedException{
		
		WebElement element = getDriver().findElement(By.linkText("Products"));
		
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		getDriver().findElement(By.linkText("Visual designer")).click();
		Thread.sleep(2000);
	}
}
