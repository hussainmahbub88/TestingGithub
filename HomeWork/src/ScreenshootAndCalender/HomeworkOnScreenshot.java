package ScreenshootAndCalender;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class HomeworkOnScreenshot extends WebDriverInitilization {
    public void screen() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        // get current date time with Date()
        Date date = new Date();

        // Now format the date
        String dateNow = dateFormat.format(date);

        // Print the Date
        System.out.println("Current date and time is " + dateNow);

        File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(src, new File("/Users/mamun/workspace/HomeWork/src/ScreenshootAndCalender" + dateNow + ".png"));
           
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void screenshotTest() {
        getDriver();
        screen();
    }	

}
