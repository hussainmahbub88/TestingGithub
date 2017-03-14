package demo;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebDriverBooleanActions extends WebDriverFactory {

	public void runProgram() {
		getDriver().findElement(By.id("u_0_1")).sendKeys("Mamun");
		getDriver().findElement(By.id("u_0_3")).sendKeys("Hussain");
		getDriver().findElement(By.id("u_0_6")).sendKeys("12345");
		getDriver().findElement(By.id("u_0_9")).sendKeys("12345");
		getDriver().findElement(By.id("u_0_b")).sendKeys("abc");
		getDriver().findElement(By.id("u_0_f")).click();
	}

	@Test
	public void isElementExamples() {
		boolean femaleRadioButton = getDriver().findElement(By.id("u_0_i")).isSelected();
		System.out.println("Is the Female Button Selected : " + femaleRadioButton);

		boolean createAccountEnable = getDriver().findElement(By.id("u_0_f")).isEnabled();
		System.out.println("\n\n\n");
		System.out.println("Is the Create Account Enabled : " + createAccountEnable);
		if (createAccountEnable = true) {
			runProgram();
		}
	}

	@Test
	public void selectFromDropDown() throws Exception {
		Select dropDown = new Select(getDriver().findElement(By.id("month")));
		dropDown.selectByIndex(3);
		Thread.sleep(5000);
		dropDown.selectByVisibleText("Jan");
		Thread.sleep(5000);
		dropDown.selectByValue("4");
		Thread.sleep(5000);
	}

	@Test
	public void selectFromDropDown1() throws Exception {
		// Select value from drop
		Select dropdown = new Select(getDriver().findElement(By.id("month")));
		// Select element by visible text
		dropdown.selectByVisibleText("Jan");
		Thread.sleep(5000);
		// Select element by index
		dropdown.selectByIndex(3);
		Thread.sleep(5000);
		// Select element by value
		dropdown.selectByValue("4");
		Thread.sleep(5000);
	}

	@Test
	public void isElementExample() {
		boolean maleRadioButton = getDriver().findElement(By.id("u_0_i")).isSelected();
		System.out.println("Male button is : " + maleRadioButton);

		boolean signUpButton = getDriver().findElement(By.id("u_0_f")).isDisplayed();
		System.out.println("Signp button is displayed: " + signUpButton);

		boolean signUpButton2 = getDriver().findElement(By.id("u_0_f")).isEnabled();
		System.out.println("Signup button is enabled: " + signUpButton2);
	}
}
