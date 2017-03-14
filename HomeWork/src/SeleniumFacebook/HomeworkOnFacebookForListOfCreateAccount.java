package SeleniumFacebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeworkOnFacebookForListOfCreateAccount extends WebDriverFactory {
	// Homework 2:
	// 1. Goto facebook landing page
	// 2. Click on Create Account button
	// 3. Verify each and every messages for all required fields.
	public static String createAccButton = ".//*[@id='u_0_g']";

	public void verifyFirstName() {
		String actualValue = getDriver().findElement(By.id("u_0_1")).getText();
		System.out.println(actualValue);
		String expectedValue = "What’s your name";
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	public void verifyLastName() {
		String actualValue = getDriver().findElement(By.id("u_0_3")).getText();
		System.out.println(actualValue);
		String expectedValue = "Last name";
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	public void verifyMobileNumOrEmail() {
		String actualValue = getDriver().findElement(By.id("u_0_6")).getText();
		System.out.println(actualValue);
		String expectedValue = "Mobile number or email";
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	public void verifyReenterMobileNumOrEmail() {
		String actualValue = getDriver().findElement(By.id("u_0_9")).getText();
		System.out.println(actualValue);
		String expectedValue = "Re-enter mobile number or email";
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	public void verifyNewPassword() {
		String actualValue = getDriver().findElement(By.id("u_0_c")).getText();
		System.out.println(actualValue);
		String expectedValue = "New password";
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test
	public static void clickOnButton() throws Exception {
		System.out.println("Home Work #2");
		getDriver().findElement(By.xpath(createAccButton)).click();
		Thread.sleep(5000);
	}
	@Test
	public void findElementByListForFirstName() {
		List<WebElement> listOfLinks = getDriver().findElements(By.tagName("input"));
		for (WebElement element : listOfLinks) {
			if (element.getText().matches("First name")) {
				verifyFirstName();
				break;
			}
		}
	}
	@Test
	public void findElementByListForLaststName() {
		List<WebElement> listOfLinks = getDriver().findElements(By.tagName("input"));
		for (WebElement element : listOfLinks) {
			if (element.getText().matches("Last name")) {
				verifyLastName();
				break;
			}
		}
	}
	@Test
	public void findElementByListForMobileNumOrEmail() {
		List<WebElement> listOfLinks = getDriver().findElements(By.tagName("input"));
		for (WebElement element : listOfLinks) {
			if (element.getText().matches("Mobile number or email")) {
				verifyMobileNumOrEmail();
				break;
			}
		}
	}
	@Test
	public void findElementByListForReenterMobileNumOrEmail() {
		List<WebElement> listOfLinks = getDriver().findElements(By.tagName("input"));
		for (WebElement element : listOfLinks) {
			if (element.getText().matches("Re-enter mobile number or email")) {
				verifyReenterMobileNumOrEmail();
				break;
			}
		}
	}
	@Test
	public void findElementByListNewPassword() {
		List<WebElement> listOfLinks = getDriver().findElements(By.tagName("input"));
		for (WebElement element : listOfLinks) {
			if (element.getText().matches("New password")) {
				verifyNewPassword();
				break;
			}
		}
	}
//	@Test
//	public void findElementForFemaleRadioButton() {
//		boolean femaleRadioButton = getDriver().findElement(By.id("u_0_m")).isSelected();
//		System.out.println("Female button is : " + femaleRadioButton);
//		
//	}
}
