package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DemogaQues {

    //Open the URL  " https://demoqa.com/browser-windows".
    //Click on all the child windows
    //Print the text present on all the child windows in the console.
    //Print the heading of the parent window in the console.

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");
    }

    /*@Test
    public void TC1_AllWindow(){
        driver.findElement(By.id("tabButton")).click();
        Set<String> windows = driver.getWindowHandles();
        List<String> windowsMain = new ArrayList<>();
        for (String window : windows){
            windowsMain.add(window);
        }

        String parent = windowsMain.get(0);
        String child = windowsMain.get(1);

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
        driver.close();

    }*/

    @Test
    public void Test2(){
        List <WebElement> elements = driver.findElements(By.id("browserWindows"));
        for(WebElement element : elements){
            element.click();
        }

    }

}
