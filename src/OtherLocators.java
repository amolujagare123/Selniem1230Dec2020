import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLocators {

    public static void main(String[] args) throws InterruptedException {


        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        // open url
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

/*
        WebElement txtName = driver.findElement(By.className("abcd"));

        Thread.sleep(2000);

        txtName.clear();


        WebElement header = driver.findElement(By.tagName("h1"));//

        System.out.println(header.getText());*/


        driver.findElement(By.tagName("input")).sendKeys("D:\\HelloWorld.java");

        driver.findElements(By.tagName("input")).get(3).sendKeys("aaa");
    }
}
