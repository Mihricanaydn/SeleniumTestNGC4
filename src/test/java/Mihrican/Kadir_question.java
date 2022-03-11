package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kadir_question {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.navigate().to("https://www.fb.com");
        driver.manage().window().maximize();
        String expectedUrl = "https://www.facebook.com";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Requested Url is valid");
        } else{
            System.out.println("Requested Url isn't valid");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[.='Create new account']")).click();
    }
}
