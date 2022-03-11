package renastech.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_Locators {

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

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Write "orange" in search box
        //we find this element using name locator
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");
        //4- Click google search button
        driver.findElement(By.name("btnK")).click();
        //5- Verify title:
        String expectedTitle="orange";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");
        }
        else{
            System.out.println("Title verification has failed");
            System.out.println("actualTitle+ " + actualTitle);
        }

        Thread.sleep(2000);
        //6-navigate back
        driver.navigate().back();

        //7-write banana in search box

        driver.findElement(By.name("q")).sendKeys("banana"+ Keys.ENTER);

        //8-verify title contains banana.
        String expectedTitle2="banana";
        String actualTitle2=driver.getTitle();

        if(actualTitle2.contains(expectedTitle2)){
            System.out.println(" Title Passed for banana");
        } else{
            System.out.println("Banana verification failed");
        }

    }

}
