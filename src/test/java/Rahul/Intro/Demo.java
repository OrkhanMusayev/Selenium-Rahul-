package Rahul.Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       //System.setProperty("webdriver.ie.driver","C:\\Users\\Orkhan\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com"); // hit URL on the browser
        System.out.println("driver.getTitle() = " + driver.getTitle()); // validate id your page title is correct
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // validate id you are landed on correct URL

        // System.out.println("driver.getPageSource() = " + driver.getPageSource()); // print page source

        Thread.sleep(5000); //  i just gave time for page loading
        driver.get("http://yahoo.com");

        Thread.sleep(5000); //  i just gave time for page loading
        driver.navigate().back(); // go back to previous page

        Thread.sleep(5000); //  i just gave time for page loading
        driver.navigate().forward(); // go forward to next page

         driver.close(); //It close current browser
        // driver.quit(); It closes all the browsers opened by Selenium script


    }
}
