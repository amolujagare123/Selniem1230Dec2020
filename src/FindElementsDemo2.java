import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://scriptinglogic.org");

        List<WebElement> buttonList =  driver.findElements(By.className("elementor-button-text"));
        // list of webelemebts

        for(int i=0;i<buttonList.size();i++)
            System.out.println(buttonList.get(i).getText());


    }
}
