import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectList {


    public static void main(String[] args) throws InterruptedException {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement listText = driver.findElement(By.id("multiSel"));

        Select selListText = new Select(listText);

        selListText.selectByVisibleText("text 1");
        selListText.selectByVisibleText("text 3");
        selListText.selectByVisibleText("text 4");

       /* Thread.sleep(2000);
        selListText.deselectByVisibleText("text 3");

        Thread.sleep(2000);
        selListText.deselectByVisibleText("text 4");*/

        Thread.sleep(2000);
        selListText.deselectAll();
    }
}
