package renastech.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_Locator {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        //linkText locator
       // driver.findElement(By.linkText("Gmail")).click();
        // **PartialLinkText locator
       // ** driver.findElement(By.partialLinkText("Gma")).click();

        driver.findElement(By.className("gb_d")).click();



    }
}
