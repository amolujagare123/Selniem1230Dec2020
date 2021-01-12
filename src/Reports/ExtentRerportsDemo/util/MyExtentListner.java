package Reports.ExtentRerportsDemo.util;

import TestNGDemos.Websites.util.Initialization;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static Reports.ExtentRerportsDemo.util.ExtentUtil.initExtentReport;
import static Reports.ExtentRerportsDemo.util.ExtentUtil.takescreenshot;

public class MyExtentListner extends Initialization implements ITestListener {

    static ExtentReports extent;
    ExtentTest test;


    public void onStart(ITestContext iTestContext)
    {
        System.out.println("====onStart=========>>>");
        if(extent==null)
            extent = initExtentReport();
    }



    public void onTestStart(ITestResult iTestResult) {

        System.out.println("====onTestStart=========>>>");

        test = extent.createTest(iTestResult.getMethod().getMethodName());

    }


    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("====onTestSuccess=========>>>");

        test.pass(iTestResult.getMethod().getMethodName()+" : this thest is passed");
    }


    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("====onTestFailure=========>>>");
        test.fail(iTestResult.getThrowable());

        try {
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("====onTestSkipped=========>>>");
        test.skip("This test is skipped");

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }



    public void onFinish(ITestContext iTestContext) {
        System.out.println("====onFinish=========>>>");

        extent.flush();
    }
}
