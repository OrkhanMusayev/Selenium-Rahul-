package Rahul.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/");

        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        System.out.println((driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()));

        // JavaScript DOM can extract hidden elements
        // because selenium cannot identify hidden elements - (AJAX implementation)
        // investigate the properties of object if it have any hidden text

        // JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor)driver;

        String script = "return document.getElementById(\"fromPlaceName\").value;";
        // here return it will return the hidden text(like System.out.println())
        String  text = (String) js.executeScript(script); // execute script
        System.out.println(text); // print text

        // BENGALURU INTERNATION AIRPORT
        int i=0;
        while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
            if (i > 10 ) {
                break;
            }
        }

        if (i > 10 ){
            System.out.println("Element not found");
        }else{
            System.out.println("Element  found");

        }
    }
}
