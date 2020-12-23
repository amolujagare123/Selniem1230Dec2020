import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginOperationXpath {
    public static void main(String[] args) throws InterruptedException {

        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        /* Homework :   // implicit wait  | Thread.sleep(10000) - > couplsary waits for 10 sec.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // maximum 10 sec , within 10 sec if it finds element it it immediately proceeds

        WebElement lnkSupplier = driver.findElement(By.linkText("Add Supplier"));
        lnkSupplier.click();


        WebElement txtName = driver.findElement(By.id("name"));
        txtName.sendKeys("Sujit");

        WebElement contact1 = driver.findElement(By.id("buyingrate"));
        contact1.sendKeys("12356");

        WebElement contact2 = driver.findElement(By.id("sellingrate"));
        contact2.sendKeys("76767");

        WebElement adress = driver.findElement(By.name("address"));
        adress.sendKeys("pune");

        WebElement btnSubmit = driver.findElement(By.name("Submit"));
        btnSubmit.click();*/

    }

}
