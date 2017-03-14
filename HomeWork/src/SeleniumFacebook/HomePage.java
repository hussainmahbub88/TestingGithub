package SeleniumFacebook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends WebDriverFactory {
	@Test
	public void verify() {
		getDriver().findElement(By.id("u_0_g")).click();

		// First Name Error
		getDriver().findElement(By.id("u_0_0")).click();
		String firstmsg = getDriver()
				.findElement(By.xpath(".//div[@id='globalContainer']/div[3]/descendant::a/parent::div/div")).getText();
		String firstexp = "What’s your name?";
		System.out.println("Expected Result : " + firstexp);
		System.out.println("Actual Result : " + firstmsg);
		Assert.assertEquals(firstmsg, firstexp);

		// Last Name Error
		getDriver().findElement(By.id("u_0_2")).click();
		String lastmsg = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[4]/descendant::a/parent::div/div")).getText();
		String lastexp = "What’s your name?";
		System.out.println("Expected Result : " + lastexp);
		System.out.println("Actual Result : " + lastmsg);
		Assert.assertEquals(lastmsg, lastexp);

		// Mobile Error
		getDriver().findElement(By.id("u_0_6")).click();
		String numbermsg = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[5]/descendant::a/parent::div/div")).getText();
		String numberexp = "You'll use this when you log in and if you ever need to reset your password.";
		System.out.println("Expected Result : " + numberexp);
		System.out.println("Actual Result : " + numbermsg);
		Assert.assertEquals(numbermsg, numberexp);

		// Re-Enter Mobile Error

		// Re-Enter Mobile Error
		getDriver().findElement(By.id("u_0_9")).click();
		String numbermsg1 = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[6]/descendant::a/parent::div/div")).getText();
		String numberexp1 = "Please re-enter your mobile number or email address.";
		System.out.println("Expected Result : " + numberexp1);
		System.out.println("Actual Result : " + numbermsg1);
		Assert.assertEquals(numbermsg1, numberexp1);

		// Password Error
		getDriver().findElement(By.id("u_0_c")).click();
		String passmsg = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[7]/descendant::a/parent::div/div")).getText();
		String passexp = "Enter a combination of at least six numbers, letters and punctuation marks (like ! and &).";
		System.out.println("Expected Result : " + passexp);
		System.out.println("Actual Result : " + passmsg);
		Assert.assertEquals(passmsg, passexp);

		// Month Error
		getDriver().findElement(By.id("month")).click();
		String monthmsg = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[8]/descendant::a/parent::div/div")).getText();
		String monthexp = "Select your birthday. You can change who can see this later.";
		System.out.println("Expected Result : " + monthexp);
		System.out.println("Actual Result : " + monthmsg);
		Assert.assertEquals(monthmsg, monthexp);

		// Day Error
		getDriver().findElement(By.id("day")).click();
		String daymsg = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[8]/descendant::a/parent::div/div")).getText();
		String dayexp = "Select your birthday. You can change who can see this later.";
		System.out.println("Expected Result : " + dayexp);
		System.out.println("Actual Result : " + daymsg);
		Assert.assertEquals(monthmsg, monthexp);

		// Year Error
		getDriver().findElement(By.id("day")).click();
		String yearmsg = getDriver()
				.findElement(By.xpath(".//*[@id='globalContainer']/div[8]/descendant::a/parent::div/div")).getText();
		String yearexp = "Select your birthday. You can change who can see this later.";
		System.out.println("Expected Result : " + yearexp);
		System.out.println("Actual Result : " + yearmsg);
		Assert.assertEquals(yearmsg, yearexp);

		// Gender Error
		// getDriver().findElement(By.xpath(".//*[@id='u_0_l']/i[1]")).click();
		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// String gendermsg =
		// getDriver().findElement(By.xpath(".//*[@id='globalContainer']/div[4]/descendant::a/parent::div/div")).getText();
		// String genderexp = "Please choose a gender. You can change who can
		// see this later.";
		// System.out.println("Expected Result : "+genderexp);
		// System.out.println("Actual Result : "+gendermsg);
		// Assert.assertEquals(gendermsg, genderexp);

	}
}
