package Rahul.Actions_Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingMultWindows {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://accounts.google.com/signup");

        driver.findElement(By.xpath("//a[.='Help']")).click();
        System.out.println("Before switching");
        System.out.println(driver.getTitle());

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);

        System.out.println("After switching");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentID);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());
    }
}
