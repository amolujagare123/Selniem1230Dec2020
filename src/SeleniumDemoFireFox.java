import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemoFireFox {
    public static void main(String[] args) {

        //open browser
        System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //maximize

        driver.manage().window().maximize();

        // open url

        driver.get("http://facebook.com");

    }

}
