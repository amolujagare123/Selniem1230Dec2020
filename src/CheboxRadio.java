import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheboxRadio {

    public static void main(String[] args) {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

       WebElement radCucumber  = driver.findElement(By.id("rad2"));
       radCucumber.click();


        WebElement checkJava  = driver.findElement(By.id("check0"));
        WebElement checkSelenium  = driver.findElement(By.id("check1"));
        WebElement checkCucumber  = driver.findElement(By.id("check2"));

        // if(checkJava.isSelected()==false)

        if(checkJava.isSelected())
            checkJava.click();

        if(!checkSelenium.isSelected())
            checkSelenium.click();

        if(!checkCucumber.isSelected())
            checkCucumber.click();

    }
}
