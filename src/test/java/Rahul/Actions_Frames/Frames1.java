package Rahul.Actions_Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        System.out.println(driver.findElements(By.tagName("iframe")).size());
        // count of frames , there is just 1 frame

        driver.switchTo().frame(0);
        // here we used by index number.We have just one frame , index number start from 0



       // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        // we switched frame by web element,also we can do by index number and string

        //driver.findElement(By.xpath("//div[@id='draggable']")).click();
        // this is frame,we are not able to handel directly.

        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source,target).build().perform();
        // drag from first frame(source) move to second frame(target)

        driver.switchTo().defaultContent();
        // we have to come back to default content



    }
}