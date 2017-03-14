package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoComplete extends WebDriverFactory {

	@Test
	public void testAutoComplete() throws InterruptedException {
		getDriver().findElement(By.xpath(".//*[@id='tab-flight-tab']")).click();
		getDriver().findElement(By.xpath(".//*[@id='flight-origin']")).sendKeys("New York");
		Thread.sleep(5000);
		List<WebElement> list = getDriver().findElements(By.className("results-item"));
		for (WebElement ele : list) {
			if (ele.getText().contains("John F. Kennedy Intl")) {
				ele.click();
				break;
			}
		}
	}
}
