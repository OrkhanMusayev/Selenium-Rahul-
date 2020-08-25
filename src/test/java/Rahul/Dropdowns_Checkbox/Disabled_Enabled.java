package Rahul.Dropdowns_Checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Disabled_Enabled {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");

//        System.out.println("driver.findElement(By.name(\"ctl00$mainContent$view_date2\")).isEnabled() = "
//                + driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println("driver.findElement(By.id(\"Div1\")).getAttribute(\"style\") = "
                            + driver.findElement(By.id("Div1")).getAttribute("style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        System.out.println("driver.findElement(By.name(\"ctl00$mainContent$view_date2\")).isEnabled() = "
                           + driver.findElement(By.id("Div1")).getAttribute("style"));

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }





    }

}