package Rahul.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffWebSite {

    public static void main(String [] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.rediff.com");

        // regular expression with CCS locator -> syntax:tagName[Attribute*=’value’]
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();

        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("hello");

        // regular expression with xpath locator -> //tagName[contains(@attribute,’value’)]
        driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();

        System.out.println("driver.findElement(By.xpath(\"//*[@id='div_login_error']/b\")).getText() = "
                           + driver.findElement(By.xpath("//*[@id='div_login_error']/b")).getText());


    }
}
