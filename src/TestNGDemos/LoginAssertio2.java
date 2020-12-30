package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginAssertio2 {
    @Test
    public void myloginValid()
    {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expected ="QUICK LINKS";

        String actual = driver.findElement(By.xpath("//div[@class='side-menu fl']/h3")).getText().toUpperCase();

        Assert.assertEquals(actual,expected,"wrong text");

        org.junit.Assert.assertEquals("",expected,actual);


        /*System.out.println(driver.getPageSource());


       boolean result =  driver.getPageSource().contains(expected);

       Assert.assertTrue(result,"the given text is not present on the page");
*/






       // driver.close();
    }



/*

    @Test
    public void myloginInvalid()
    {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("adghghmin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admhghin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.close();
    }

    @Test
    public void myloginBlank()
    {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.close();
    }
*/


}
