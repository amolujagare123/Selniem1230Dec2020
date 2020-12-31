package TestNGDemos.Websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForumSites {

    WebDriver driver;

    @BeforeClass
    public void mymethod1()
    {
        //open browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
    }

    @AfterClass
    public void myMethod2()
    {
        driver.close();
    }


    @Test
    public void twitter() {

        // open url
        driver.get("http://stackoverflow.com");
    }

    @Test
    public void facebook() {

        // open url
        driver.get("www.sqaforums.");
    }

   
}
