package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String actualTitle= driver.getTitle();
        String expectedTitle="Google";
        Thread.sleep(2000);
        driver.quit();

        if(actualTitle.equals(expectedTitle))
            System.out.println("Title matched");
        else
            System.out.println("Title didn't match");

    }
}
