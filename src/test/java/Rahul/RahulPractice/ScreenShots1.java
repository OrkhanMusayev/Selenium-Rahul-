package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots1 {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().deleteCookieNamed("jvd");
        driver.get("http://www.google.com");

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // code above we use to take screenshot of page

        FileUtils.copyFile(src,new File("C:\\Users\\Orkhan\\screenshot.png"));
        // we can not directly download to disk C, we need to path direction like above


        /**
         * Screenshot in Selenium Webdriver
         * A Screenshot in Selenium Webdriver is used for bug analysis.
         * Selenium webdriver can automatically take screenshots during the execution.
         * But if users need to capture a screenshot on their own,
         * they need to use the TakeScreenshot method which notifies the
         * WebDrive to take the screenshot and store it in Selenium.
         *
         * Step 1) Convert web driver object to TakeScreenshot
         * TakesScreenshot ts = (TakesScreenshot)driver;
         *
         * Step 2) Call getScreenshotAs method to create image file
         * File source = ts.getScreenshotAs(OutputType.FILE);
         * Syntax:
         * TakesScreenshot ts = (TakesScreenshot)driver;
         * File source = ts.getScreenshotAs(OutputType.FILE);
         * FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
         * System.out.println("the Screenshot is taken");
         */
    }
}
