package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercises3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29079/eng-vs-pak-2nd-test-pakistan-tour-of-england-2020");


        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
        int rowCount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        int sum = 0;
        for (int i = 0; i < count -2 ; i++) {
            String value = table.findElements(
                    By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueInteger = Integer.parseInt(value);
            sum = sum + valueInteger;
        }

        String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasValue = Integer.parseInt(extras);
        int totalSumValue = sum + extrasValue;
        System.out.println("totalSumValue = " + totalSumValue);

//        System.out.println(driver.findElement
//                (By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        String actualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int actualTotalValue = Integer.parseInt(actualTotal);
        if (actualTotalValue==totalSumValue){
            System.out.println("Count Matches");
        }else{
            System.out.println("Count Fails");
        }

    }
}