package Rahul.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceWebSite {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://login.salesforce.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000); //  i just gave time for page loading
        //driver.findElement(By.name("username")).sendKeys("HELLO");
        //driver.findElement(By.name("pw")).sendKeys("123456");
        //driver.findElement(By.className("button r4 wide primary")).click();
        // ERROR, because className attribute value has empty space,u cannot use className directly

/*
        // code below we use xpath locator --> syntax tagName[@attribute=‘value’]

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("helohelohelo");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("helo");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

 */


        // code below we use css locator --> syntax tagName[attribute=’value’] -> tagName#id

//        driver.findElement(By.cssSelector("#username")).sendKeys("orikorikorik");
//        driver.findElement(By.cssSelector("#password")).sendKeys("789456123");
//        driver.findElement(By.cssSelector("#Login")).click();
//        //driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
//        System.out.println("driver.findElement(By.cssSelector(\"#error\")).getText() = "
//                           + driver.findElement(By.cssSelector("#error")).getText());

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("myowncss");
        driver.findElement(By.cssSelector("input#password")).sendKeys("131313");
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        //*[@id="forgot_password_link"]
    }
}
