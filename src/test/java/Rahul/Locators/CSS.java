package Rahul.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();

        //xpath -> //tagName[@attribute='value']
        //css -> tagName[attribute='value']

        //driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("fewrew");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("orkhan");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input[name='Login']")).click(); // also we can use #Login
    }
}
