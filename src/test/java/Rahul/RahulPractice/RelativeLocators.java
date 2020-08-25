package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
// RelativeLocators does not work with 3.141.59 version of selenium
//        <dependency>
//            <groupId>org.seleniumhq.selenium</groupId>
//            <artifactId>selenium-java</artifactId>
//            <version>4.0.0-alpha-3</version>
//        </dependency>


public class RelativeLocators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

/**
 * Selenium Relative Locators| Friendly Locators
 * above() – finds an element or elements located above a fixed element.
 * below() – finds an element or elements located below a fixed element.
 * near() – finds an element or elements located near a fixed element.
 * toLeftOf() – finds an element or elements located to the left of a fixed element.
 * toRightOf() – finds an element or elements located to the right of a fixed element.
 *
 * Syntax: driver.findElement(withTagName("XX").above(WebElement));
 *  work with only with tagName
 */

        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println( driver.findElement(withTagName("label").above(nameEditBox)).getText() );
        // hey print me label(Name) with label tagName, which located above nameBox easy

        WebElement dateOFBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(withTagName("input").below(dateOFBirth)).sendKeys("01/01/2001");
        // hey send information input(dateOfBirth) which located below easy


        WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(withTagName("input").toLeftOf(iceCream)).click();

        WebElement rb = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());
        // get me the label of first radio button

    }
}
