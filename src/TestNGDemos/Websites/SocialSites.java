package TestNGDemos.Websites;

import TestNGDemos.Websites.util.Initialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SocialSites extends Initialization  {


    @Test (priority =  1)
    public void twitter() {

        // open url
        driver.get("http://twitter.com");
    }

    @Test (priority = 4)
    public void facebook() {

        // open url
        driver.get("http://facebook.com");
    }

    @Test (priority = 3)
    public void instagram() {

        // open url
        driver.get("http://instagram.com");
    }

    @Test (priority = 2 )
    public void linkedin() {

        // open url
        driver.get("http://linkedin.com");
    }
}
