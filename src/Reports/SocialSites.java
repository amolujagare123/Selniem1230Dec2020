package Reports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SocialSites {

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

  /*  @AfterClass
    public void myMethod2()
    {
        driver.close();
    }
*/

    @Test (priority =  1)
    public void twitter() throws IOException {

        // open url
        driver.get("http://facebook.com");


       // take screen shot

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile  = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile,new File("D:\\pallavi\\screenshot.png"));

        // here we are copying a file object into a real file

    }


}
