package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableSort {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("tr td:nth-child(2)")).click();
       // driver.findElement(By.cssSelector("tr td:nth-child(2)")).click();

        List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        ArrayList<String> originalList = new ArrayList<>();
        for (int i = 0; i < firstColList.size(); i++) {
            originalList.add(firstColList.get(i).getText());
        }

        ArrayList<String> copiedList = new ArrayList<>();

        for (int i = 0; i < originalList.size() ; i++) {
            copiedList.add(originalList.get(i));
        }
        System.out.println("======================================================");

        Collections.sort(copiedList);
        for (String str:copiedList) {
            System.out.println(str);
        }
        System.out.println("======================ORIGINAL LIST================================");

        for (String str:originalList) {
            System.out.println(str);
        }

        Assert.assertTrue(originalList.equals(copiedList));





    }
}