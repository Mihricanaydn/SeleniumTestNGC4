package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_Feb27 {

    //Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    //Step 2) Enter Any Customer id.
    //Step 3) After entering the customer ID, Click on the “Submit” button.
    //Step 4) Reject/accept the alert.

    WebDriver driver;
     @BeforeMethod
    public void setUp(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
     }

     @Test
    public void TC1() throws InterruptedException {
         WebElement customerID = driver.findElement(By.xpath("//input[@type='text']"));
         customerID.sendKeys("Aydin");
         Thread.sleep(1000);
         driver.findElement(By.name("submit")).click();
         Thread.sleep(500);
         driver.switchTo().alert().dismiss();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type='text']")).clear();

         driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Mihrican");

         Thread.sleep(1000);
         driver.findElement(By.name("submit")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Alert alert = driver.switchTo().alert();
         alert.accept();
     }
}
