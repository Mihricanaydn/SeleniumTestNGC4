package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Feb20 {
    public static void main(String[] args) throws InterruptedException {

        //TASK1: Google Feeling lucky button
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write "apple" in search box
        //click i am feeling lucky button
        //Verify title contains Apple

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='RNmpXc']")).click();

        String containsTitle = "Apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(containsTitle)){
            System.out.println("Accepted title is matched");
        } else{
            System.out.println("Accepted title isn't matched");
        }




    }
}
