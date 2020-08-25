package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class ScreenShot2_spicificPart {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.switchTo().newWindow(WindowType.TAB);
        // selenium will open one blank tab for you,ready receive any url

        Set<String> handles = driver.getWindowHandles(); // return set of windows
        Iterator<String> it = handles.iterator(); // stand for iterate windows
        String parentWindowId = it.next(); // go to next page which is parent window
        String childWindowId = it.next(); // go to next page which is child window
        driver.switchTo().window(childWindowId); // switch to child window

        driver.get("https://rahulshettyacademy.com/"); // open this url in child window
        String courseName = driver.findElements(By.cssSelector
                ("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        // chose first course,take text of this course
        driver.switchTo().window(parentWindowId); // switch to parent window
        WebElement name = driver.findElement(By.cssSelector("[name='name']")); // find name box
        name.sendKeys(courseName); // past to the name box the course text

        // take a screenshot specific part in web page
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\Orkhan\\screenshot.png"));


        // get height and width
        System.out.println("name.getRect().getDimension().getHeight() = "
                            + name.getRect().getDimension().getHeight());

        System.out.println("name.getRect().getDimension().getWidth() = "
                           + name.getRect().getDimension().getWidth());




    }
}
