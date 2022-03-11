package renastech.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // Xpath second way /tagname[.'text] -- looks for excat text match for any attribute
        WebElement TestingHeader = driver.findElement(By.xpath("//b[.='Testing']"));
        System.out.println(TestingHeader.getText());
        //tagname[contains(@attribute, 'value') --locate webelemnt with the given value if contains

        //absolute Xpath
        WebElement TestingHeader2= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]/b"));

        }
}
