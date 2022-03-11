package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_Feb20 {
    public static void main(String[] args) throws InterruptedException {
        //go to https://opensource-demo.orangehrmlive.com/
        //locate user name and send user name, (username=Admin)
        //locate user password and send password (password=admin123)
        //click on the login button

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();


    }
}
