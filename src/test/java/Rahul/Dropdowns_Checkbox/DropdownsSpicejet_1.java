package Rahul.Dropdowns_Checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropdownsSpicejet_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // i gave

        /**
         * Dropdown MUST have SELECT TAG
         */

        driver.findElement(By.id("divpaxinfo")).click();
        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        select.selectByValue("2");
        select.selectByIndex(6); // index number starts from 0 that's why 6 will 7 in dropdown
        select.selectByVisibleText("5");
       // select.deselectAll();

    }
}
