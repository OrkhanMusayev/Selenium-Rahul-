package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercises1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29079/eng-vs-pak-2nd-test-pakistan-tour-of-england-2020");

        System.out.println(driver.findElement( // 23
                       By.xpath("//div[text()='Extras']/following-sibling::div")).getText());

        System.out.println(driver.findElement( // 236
                       By.xpath("//div[text()='Total']/following-sibling::div")).getText());



    }
    }
