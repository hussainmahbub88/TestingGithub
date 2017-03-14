package SeleniumFacebook;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickinOnCreateAccountOnFacebook extends WebDriverFactory {

	@Test
	public void createAccountButton() throws InterruptedException {

		// click button
		getDriver().findElement(By.id("u_0_g")).click(); // click on create
															// account
		String actual_clickbutton = getDriver().findElement(By.id("u_0_g")).getAttribute("innerHTML");
		String expected_clickbutton = "Create Account";
		Assert.assertEquals(expected_clickbutton, actual_clickbutton);

		// For the firstName
		getDriver().findElement(By.id("u_0_1")).click();
		String actual_firstname = getDriver().findElement(By.id("u_0_1")).getAttribute("innerHTML");
		System.out.println(actual_firstname);
		String expected_firstname = "What's your first name";
		System.out.println(expected_firstname);
		Assert.assertEquals(actual_firstname, expected_firstname);
		Thread.sleep(5000);
		getDriver().findElement(By.id("u_0_1")).sendKeys("Mohammad");

		// For the lastname in text edit field
		getDriver().findElement(By.id("u_0_3")).click();
		String actual_lastname = getDriver().findElement(By.id("u_0_3")).getAttribute("innerHTML");
		String expected_lastname = "What's your last name";
		Assert.assertEquals(actual_lastname, expected_lastname);
		getDriver().findElement(By.id("u_0_3")).sendKeys("Taher");

		// For the mobile of email textbox edit field
		getDriver().findElement(By.id("u_0_6")).click();
		String actual_mobileoremail = getDriver().findElement(By.id("u_0_6")).getAttribute("innerHTML");
		String expected_mobileoremail = "You'll use this when you log in and if you ever need to reset your password.";
		Assert.assertEquals(actual_mobileoremail, expected_mobileoremail);
		getDriver().findElement(By.id("u_0_6")).sendKeys("taher@gmail.com");

		// For the re-enter mobile or email field
		getDriver().findElement(By.id("u_0_9")).click();
		String actual_re_mobileoremail = getDriver().findElement(By.id("u_0_9")).getAttribute("innerHTML");
		String expected_re_mobileoremail = "Please re-enter your mobile number or email address";
		Assert.assertEquals(actual_re_mobileoremail, expected_re_mobileoremail);
		getDriver().findElement(By.id("u_0_9")).sendKeys("taher@gmail.com");

		// For the new password feild
		getDriver().findElement(By.id("u_0_c")).click();
		String actual_newpassword = getDriver().findElement(By.id("u_0_c")).getAttribute("innerHTML");
		String expected_newpassword = "Enter a combination of al least six nubers,letters and punctuation marks(like! and &).";
		Assert.assertEquals(actual_newpassword, expected_newpassword);
		getDriver().findElement(By.id("u_0_c")).sendKeys("Technosoft!");

		// For the birthday field
		getDriver().findElement(By.id("month")).sendKeys("Feb");
		getDriver().findElement(By.id("day")).sendKeys("5");
		getDriver().findElement(By.id("year")).sendKeys("2010");

		// For the radio button
		List<WebElement> radio = getDriver().findElements(By.xpath("//input[@name='sex' and @type='radio']"));// Customize
																												// xpath.
		for (int i = 0; i < radio.size(); i++) {
			WebElement Radio_button = radio.get(i);
			String value = Radio_button.getAttribute("value");
			if (value.equalsIgnoreCase("2")) { // Male radio_button is selected
												// value 2
				Radio_button.click();
				System.out.println("Radio_button is selected: " + value);
			}
		}
	}

}
