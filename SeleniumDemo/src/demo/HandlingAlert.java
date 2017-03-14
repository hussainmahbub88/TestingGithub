package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingAlert extends WebDriverFactory{
	@Test
	public static void alertHandles() throws InterruptedException{
		getDriver().switchTo().frame("iframeResult");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("html/body/button")).click();
		Thread.sleep(2000);
		getDriver().switchTo().alert().accept();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("html/body/button")).click();
		Thread.sleep(2000);
		getDriver().switchTo().alert().dismiss();
		getDriver().findElement(By.xpath("html/body/button")).click();
		Thread.sleep(2000);
		getDriver().switchTo().alert().getText();
		getDriver().switchTo().alert().dismiss();
		getDriver().findElement(By.xpath("html/body/button")).click();
		Thread.sleep(2000);
		getDriver().switchTo().alert().sendKeys("Test");
		Thread.sleep(2000);
	}
}
