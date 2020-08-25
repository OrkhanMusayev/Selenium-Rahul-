package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com"); // url in the web browser

        WebElement source = driver.findElement(By.id("fromCity"));
        source.click(); // click on first search box
        source.sendKeys("MUM"); // city name Mumbai(BOM)
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER); // press ENTER

        WebElement destination = driver.findElement(By.id("toCity"));
        destination.click();
        destination.sendKeys("DEL"); // city name
        Thread.sleep(2000);
        destination.sendKeys(Keys.ARROW_DOWN); // choose second one from dropdown
        destination.sendKeys(Keys.ENTER);






    }
}
