package JunitDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {

    static WebDriver driver;

    @BeforeClass // run before first  test method of the class
    public static void myMethod1()
    {
        //open browser
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
    }

    @AfterClass  // run after last test method of the class
    public static void myMethod2() throws InterruptedException {
        Thread.sleep(2500);
        driver.close();
    }

    @Test
    public void myloginValid()
    {

        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

       /* WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();*/

    }


    @Test
    public void myloginInvalid()
    {

        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("adghghmin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admhghin");

        /*WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();*/

    }

    @Test
    public void myloginBlank()
    {

        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

       /* WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();*/

    }


}
