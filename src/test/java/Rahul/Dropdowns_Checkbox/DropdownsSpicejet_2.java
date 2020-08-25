package Rahul.Dropdowns_Checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DropdownsSpicejet_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // i gave

        /**
         * Dropdown MUST have SELECT TAG
         */

//        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//        Thread.sleep(3000);
//        select.selectByIndex(3);
//        select.selectByValue("INR");
//        select.selectByVisibleText("AED");


        // //option[@value='MAA'] xpath for chennai

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();


        // div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']
        // div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']
        // from parent to child web element








    }
}
