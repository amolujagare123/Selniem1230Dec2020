package TestNGDemos.Websites;

import TestNGDemos.Websites.util.Initialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForumSites extends Initialization {


    @Test
    public void stackoverflow() {

        // open url
        driver.get("http://stackoverflow.com");

        Assert.assertEquals("page title",driver.getTitle(),"this is a wrong page");


    }

    @Test
    public void sqaforums() {

        // open url
        driver.get("http://sqaforums.com");
    }

   
}
