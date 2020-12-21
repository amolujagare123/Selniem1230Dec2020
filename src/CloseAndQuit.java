import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximize
        driver.manage().window().maximize();

        // open url
        driver.get("http://naukri.com");

       // driver.close();

        Thread.sleep(2000);

        driver.quit();
    }

}
