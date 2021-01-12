package Reports.ExtentRerportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentUtil {

    static ExtentReports extent;

    public static ExtentReports initExtentReport()
    {

        ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReports\\report.html");
        extent = new ExtentReports();

        reporter.config().setReportName("Regression report");
        reporter.config().setDocumentTitle("Stock Project bug report");

        extent.attachReporter(reporter);

        extent.setSystemInfo("Project name","Stock management");
        extent.setSystemInfo("Developers name","Praful");
        extent.setSystemInfo("Testers name","Sopan");
        extent.setSystemInfo("testing start date","6 jan 21");
        extent.setSystemInfo("dead line","31 jan 21");

        return  extent;
    }



    public static String takescreenshot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File scrFile  = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

        String fileName = "Img_"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("ExtentReports\\screenshots\\"+fileName));

        return  fileName;

    }
}
