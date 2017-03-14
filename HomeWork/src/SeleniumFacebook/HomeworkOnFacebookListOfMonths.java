package SeleniumFacebook;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class HomeworkOnFacebookListOfMonths extends WebDriverFactory{
   
	
	@Test
   public void isElementExample() {
        
        WebElement dropDownmenu = getDriver().findElement(By.id("month"));
        List<WebElement> lists = dropDownmenu.findElements(By.tagName("option"));
            for(WebElement element: lists)  
            {
                if (element.getText().equals("Jan")) {
                    System.out.println("Jan is in the list");
                    break;
                }
                
            }
   }
}
