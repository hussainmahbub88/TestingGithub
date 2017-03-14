package ScreenshootAndCalender;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomeworkOnWindowHandling extends WebDriverInitilization{

	public static void switchToWindow(int index){
		List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(listOfWindows.get(index));
	}
	@Test
	public static void clickOnDataPolicy(){
		getDriver().findElement(By.xpath(".//*[@id='privacy-link']")).click();
		switchToWindow(0);
		//getDriver().findElement(By.xpath(".//*[@id='globalContainer']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]").click();
		
		
		
	}
}
