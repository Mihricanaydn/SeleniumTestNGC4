package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trytask {

    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write "orange" in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with "orange" word
        //6-navigate back
        //7-write banana in search box
        //8-verify title contains banana.

        // Task 2


        System.out.println(" Task 2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().to("https:www.amazon.com");
        driver.manage().window().maximize();
        String containsTitle="Smile";
        String actualTitle=driver.getTitle();
        if(driver.getTitle().contains("Smile"))
            System.out.println(" Page Title Contains " + containsTitle);

        else
            System.out.println(" Page Title does not Contains " + containsTitle);

    }
}
