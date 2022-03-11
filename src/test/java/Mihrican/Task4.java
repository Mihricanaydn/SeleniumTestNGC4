package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {

        //1.open Chrome browser
        //2.Go to https://www.amazon.com
        //3.type laptop on search box
        //4.then click on search button
        //5.verify title

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle= "Amazon.com:laptop";

        if(expectedTitle.equals("Amazon.com:laptop")){
            System.out.println("Title is match");
        } else{
            System.out.println("Title isn't match");
        }







    }
}
