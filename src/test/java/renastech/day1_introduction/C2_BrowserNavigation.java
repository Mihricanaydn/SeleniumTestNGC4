package renastech.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

      //  driver.navigate().to("https://facebook.com");
        driver.manage().window().fullscreen();
        driver.get("https://apple.com");
        Thread.sleep(2000);
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
       // driver.close(); it will close the tabs only current webpage
        driver.quit();

    }

}
