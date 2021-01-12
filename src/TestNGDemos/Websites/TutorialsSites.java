package TestNGDemos.Websites;

import TestNGDemos.Websites.util.Initialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends Initialization {


    @Test (priority =  1)
    public void scriptinglogic() {

        // open url
        driver.get("http://scriptinglogic.com");
    }

    @Test (priority = 4)
    public void tutorialspoint() {

        // open url
        driver.get("http://tutorialspoint.com");
    }

    @Test (priority = 3)
    public void w3schools() {

        // open url
        driver.get("https://www.w3schools.com");
    }

    @Test (priority = 2 )
    public void javatpoint() {

        // open url
        driver.get("https://www.javatpoint.com/");
    }
}
