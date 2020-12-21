import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("http://lifepartner.in");

        WebElement drpMStatus = driver.findElement(By.name("ms"));

        Select selMstatus = new Select(drpMStatus);

       // selMstatus.selectByVisibleText("Married earlier");

       // selMstatus.selectByIndex(1);

        selMstatus.selectByValue("7");
    }
}
