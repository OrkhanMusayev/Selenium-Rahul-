package Rahul.Dropdowns_Checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSpicejet {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
         driver.findElement(By.xpath("//a[@xpath='1']")).click();
         WebElement element = driver.findElement(By.xpath("//a[@xpath='1']"));
        System.out.println("element.isSelected() = " + element.isSelected());


    }
}
