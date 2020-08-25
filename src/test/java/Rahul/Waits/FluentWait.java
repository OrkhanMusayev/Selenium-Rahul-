package Rahul.Waits;

import Rahul.Utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FluentWait {
    //Dynamically Loaded Page Elements
    String url = "http://the-internet.herokuapp.com/dynamic_loading/1";

    @Test
    public void fluentWaitExample() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get(url);
        BrowserUtils.wait(1);
        driver.findElement(By.cssSelector("[id='start'] button")).click();
        WebElement textArea = driver.findElement(By.xpath("//h4[contains(text(),'Hello')]"));
        BrowserUtils.fluentWait(textArea, driver);
        Assert.assertTrue(textArea.isDisplayed());
    }

}