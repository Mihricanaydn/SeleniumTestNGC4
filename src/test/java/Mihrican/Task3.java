package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException{

        //1- Open a chrome browser and go to google
        //2- Click to Gmail link from top right
        //3- Verify Title contains Gmail, expected: "Gmail"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.findElement(By.className("gb_d")).click();
        Thread.sleep(2000);


        String ExceptedTitle = "Gmail";
        String actualTitle=driver.getTitle();
        Thread.sleep(2000);
        driver.quit();

        if(actualTitle.contains(ExceptedTitle)){
            System.out.println(" Expected Title is match");
        } else{
            System.out.println(" Expected title isn't match");
        }

    }
}
