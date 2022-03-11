package renastech.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C3_DifferentBrowsersSetup {
    public static void main(String[] args) {

        //firefox Browser

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //Edge Browser
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();



    }
}
