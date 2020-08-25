package Rahul.RahulPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("sessionKey");

        // click on any link
        // login page -verify login url

        /**
         * driver.manage().getCookies();   // Return The List of all Cookies
         * driver.manage().getCookieNamed(arg0);  //Return specific cookie according to name
         * driver.manage().addCookie(arg0);   //Create and add the cookie
         * driver.manage().deleteCookie(arg0);  // Delete specific cookie
         * driver.manage().deleteCookieNamed(arg0); // Delete specific cookie according Name
         * driver.manage().deleteAllCookies();  // Delete all cookies
         */

    }
}
