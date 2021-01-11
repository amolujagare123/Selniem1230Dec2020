package Reports.ExtentRerportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

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
}
