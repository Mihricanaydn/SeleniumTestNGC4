package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Question2 {
    //Scenario:
    //1.Open a Browser (write the generic code such that by changing the parameter browser can be changed.)
    //2.Navigate to https://flipkart.com website.
    //3.Write a method to find the count (number of) links on the homepage of Flipkart.
    //4.Write another method to print link text and URLs of all the links on the page of Flipkart.
    //Flipkart.com
    //Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
    //Shop for electronics, apparels & more using our Flipkart app Free shipping & COD.

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://flipkart.com");
    }

    @Test
    public void TC1() {
        List<WebElement> allLink = driver.findElements(By.tagName("a"));
        System.out.println("The number of links " + allLink.size());

        for (WebElement link:allLink){
            System.out.println("Link Text : " + link.getText());
            System.out.println("Link URL : " + link.getAttribute("href"));


        }
    }
}