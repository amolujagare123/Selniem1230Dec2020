package TestNGDemos.Websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites {

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


    @Test (priority =  1)
    public void twitter() {

        // open url
        driver.get("http://scriptinglogic.com");
    }

    @Test (priority = 4)
    public void facebook() {

        // open url
        driver.get("http://tutorialspoint.com");
    }

    @Test (priority = 3)
    public void instagram() {

        // open url
        driver.get("https://www.w3schools.com");
    }

    @Test (priority = 2 )
    public void linkedin() {

        // open url
        driver.get("https://www.javatpoint.com/");
    }
}