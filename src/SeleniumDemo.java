import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {

        //open browser | C:\Users\PC\Downloads\ExprtoCucumberFramework\Selniem1230Dec2020\Drivers\chromedriver.exe
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //maximize
        driver.manage().window().maximize();

        // open url

        driver.get("http://facebook.com");

    }

}
