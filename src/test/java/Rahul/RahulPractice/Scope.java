package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        System.out.println("driver.findElements(By.tagName(\"a\")).size() = "
                           + driver.findElements(By.tagName("a")).size()); // 27 links
        // count how many links have in page.
        // We used tagName("a"),because all links located between <a>links</a>

        WebElement footerMenu = driver.findElement(By.id("gf-BIG"));
        System.out.println("footerMenu.findElements(By.tagName(\"a\")).size() = "
                           + footerMenu.findElements(By.tagName("a")).size());
        // count how many links have in footer menu area.

        WebElement columnDriver = footerMenu.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println("columnDriver.findElements(By.tagName(\"a\")).size() = "
                           + columnDriver.findElements(By.tagName("a")).size());
        // count how many links have in first column footer menu

        /**
         * click on each link in the column and check if the pages are opening
         */

        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
            Thread.sleep(5000);
        }

        /**
         * open all the tab and get all titles
         */

        Set<String> abc =  driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

    }
}