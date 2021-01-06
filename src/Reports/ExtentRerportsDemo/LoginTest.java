package Reports.ExtentRerportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static Reports.ExtentRerportsDemo.util.ScreenShots.takescreenshot;

public class LoginTest {

    ExtentReports extent;
    ExtentSparkReporter reporter;


    @BeforeClass
    public void init()
    {

        reporter = new ExtentSparkReporter("Reports\\report.html");
        extent = new ExtentReports();

        reporter.config().setReportName("Regression report");
        reporter.config().setDocumentTitle("Stock Project bug report");

        extent.attachReporter(reporter);

        extent.setSystemInfo("Project name","Stock management");
        extent.setSystemInfo("Developers name","Praful");
        extent.setSystemInfo("Testers name","Sopan");
        extent.setSystemInfo("testing start date","6 jan 21");
        extent.setSystemInfo("dead line","31 jan 21");

    }

    @AfterClass
    public void printReport()
    {
        extent.flush();
    }


    @Test
    public void myloginValid() throws IOException {
        ExtentTest test = extent.createTest("myLoginValid");
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        //maximize
        driver.manage().window().maximize();

        test.info("browser is maximized");
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is cliked");

        String expected ="POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "wrong page title");
            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
           test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }


    }


    @Test
    public void myloginInValid() throws IOException {
        ExtentTest test = extent.createTest("myLogininValid");
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        //maximize
        driver.manage().window().maximize();

        test.info("browser is maximized");
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is cliked");

        String expected ="POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "wrong page title");
            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }


    }

    @Test
    public void myloginBlank() throws IOException {
        ExtentTest test = extent.createTest("myLoginblank");
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        //maximize
        driver.manage().window().maximize();

        test.info("browser is maximized");
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is cliked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "wrong page title");
            test.pass("this test is passed");
        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/" + takescreenshot(driver));
        }

    }
}
