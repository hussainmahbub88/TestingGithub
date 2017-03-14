package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {

    private static WebDriver driver = null;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver","/Users/mamun/workspace/jarlib/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("http://facebook.com");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void myTestA() {
        System.out.println("This is my sample test");
    }

    @Test
    public void myTestB() {
        System.out.println("This is my another test");
    }
}