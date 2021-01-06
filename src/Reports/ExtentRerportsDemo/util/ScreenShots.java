package Reports.ExtentRerportsDemo.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShots {


    public static String takescreenshot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File scrFile  = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

        String fileName = "Img_"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+fileName));

        return  fileName;

    }

}
