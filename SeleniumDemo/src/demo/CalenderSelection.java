package demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CalenderSelection extends WebDriverFactory {
	@Test
	public void selectDateFromCalender() throws InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("d");
		Date date = new Date();
		String todayDate = sdf.format(date);

		getDriver().findElement(By.xpath(".//*[@id='qf-0q-localised-check-in']")).click();
		List<WebElement> days = getDriver().findElements(By.xpath(".//*[@class='widget-datepicker-bd']/descendant::a"));
		ArrayList<String> selectDays = new ArrayList<>();

		for (WebElement day : days) {
			String expectedDay = day.getText();
			if (expectedDay.equals(todayDate)) {
				selectDays.add(expectedDay);
				day.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
}
