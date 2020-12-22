import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobPortalMultiList {


    public static void main(String[] args) throws InterruptedException {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement citylistText = driver.findElement(By.id("source_118"));

        Select selCitylistText = new Select(citylistText);

        selCitylistText.selectByVisibleText("Bangalore");
        selCitylistText.selectByVisibleText("Mumbai");
        selCitylistText.selectByVisibleText("Delhi");

        WebElement btnAdd = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));
        btnAdd.click();

       // another list box selection

        WebElement cityAddedList = driver.findElement(By.id("fld_118"));

        Select selCityAdded = new Select(cityAddedList);

        selCityAdded.selectByVisibleText("Mumbai");
        selCityAdded.selectByVisibleText("Delhi");

        Thread.sleep(2000);
        WebElement btnRemove = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
        btnRemove.click();

    }
}
