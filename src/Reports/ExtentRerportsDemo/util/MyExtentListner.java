package Reports.ExtentRerportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static Reports.ExtentRerportsDemo.util.ExtentUtil.initExtentReport;

public class MyExtentListner implements ITestListener {

    static ExtentReports extent;
    ExtentTest test;

    @Override
    public void onStart(ITestContext iTestContext)
    {
        System.out.println("====onStart=========>>>");
        if(extent==null)
            extent = initExtentReport();
    }


    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("====onTestStart=========>>>");

        test = extent.createTest(iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("====onTestSuccess=========>>>");

        test.pass(iTestResult.getMethod().getMethodName()+" : this thest is passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("====onTestFailure=========>>>");
        test.fail(iTestResult.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("====onTestSkipped=========>>>");
        test.skip("This test is skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("====onFinish=========>>>");

        extent.flush();
    }
}
