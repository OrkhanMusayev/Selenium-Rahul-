package Rahul.Actions_Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class action1 {

    static String url = "http://www.amazon.com";
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
                        .sendKeys("hello").doubleClick().build().perform();
        // this line of code perform to clicked to search button in amazon web site,then press shift
        // keyword and type HELLO with uppercase.




        // moves to specific element
        a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
        // build() method means this step is ready to execute,just ready
        //if you want to execute you need to use perform() method

        a.moveToElement(move).contextClick().build().perform();
        // this code i create in order to do right click

        //a.moveToElement(move).clickAndHold().build().perform();



    }
}
