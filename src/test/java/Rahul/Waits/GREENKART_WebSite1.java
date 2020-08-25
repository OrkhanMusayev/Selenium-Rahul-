package Rahul.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GREENKART_WebSite1 {
    public static void main(String[] args) throws InterruptedException {
////button[.='Place Order']
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // apply 5 sec for each line code,wait 5 sec , do not immediately fail. Not good give more than 10 sec
        WebDriverWait driverWait = new WebDriverWait(driver,5);
        //wait 5 sec until specific element will visible on the page


        String[] products = {"Broccoli", "Cucumber", "Tomato", "Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver, products);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click(); // cart
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); // PROCEED TO CHECKOUT

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy"); // text in promo code
        driver.findElement(By.cssSelector("button.promoBtn")).click();//apply button

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println("driver.findElement(By.cssSelector(\"span.promoInfo\")).getText() = "
                           + driver.findElement(By.cssSelector("span.promoInfo")).getText());

        driver.findElement(By.xpath("//button[.='Place Order']")).click();

    }




    public static void addItems(WebDriver driver, String[] products) {

        List<WebElement> webElements = driver.findElements(By.cssSelector("h4.product-name"));
        // return type is list of web elements
        for (int i = 0; i < webElements.size(); i++) {

            //Broccoli - 1 Kg
            //Broccoli,  1Kg
            String[] text = webElements.get(i).getText().split("-");// index=0 -> broccoli, index=1 -> Cauliflower
            String formatterName = text[0].trim(); // remove empty spaces from begin and end
            // format it to get actual vegetable name
            // convert array into array list for easy search using ==>> Arrays.asList(); method
            // check whatever name you extracted is present in array or not
            List items = Arrays.asList(products);
            int j = 0;
            if (items.contains(formatterName)) { // if product name contains cucumber
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); // click to add to cart
                if (j == products.length) {
                    break;
                }
            }


        }
    }
}