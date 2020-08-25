package Rahul.Dropdowns_Checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        // return type of driver.findElements -> list of webElements
        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option :options) { //  we use loop to iterate when text will match with India
            if(option.getText().equalsIgnoreCase("India")){
                option.click(); // click India and stop to execution
                break;
            }
        }
    }
    }

