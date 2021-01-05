package Reports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocialSitesScreenshots {

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
        driver.get("http://google.com");


       // take screen shot

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile  = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

        String fileName = "Img_"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("D:\\pallavi\\"+fileName));

        // here we are copying a file object into a real file

    }


}
