package Rahul.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class FacebookWebSite {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        Thread.sleep(5000); //  i just gave time for page loading
        driver.findElement(By.id("email")).sendKeys("orkhan");
        driver.findElement(By.name("pass")).sendKeys("orkhan");
       // driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).sendKeys(); // login button
        driver.findElement(By.linkText("Forgot account?")).click();



    }
}
