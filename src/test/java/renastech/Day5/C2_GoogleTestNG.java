package renastech.Day5;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C2_GoogleTestNG {

    //1- Go to google
    //2- Verify title is google
    //1- Go to google
    //search laptop
    //make sure title contains laptop

    WebDriver driver;

    @BeforeMethod
    public void setUp(){


    driver = WebDriverUtil.getDriver("Chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://geogle.com"); }

    @Test(priority = 1)
    public void TC1_GoogleVerifyTitle() {


        WebElement searchBox = driver.findElement(By.xpath("//input[@value='Google Search ']"));
        searchBox.sendKeys("Laptop", Keys.ENTER);
        //make sure title contains laptop
        String actualTitle=driver.getTitle();
        String containedTitle="laptop";

        boolean b=actualTitle.contains(containedTitle);
        Assert.assertTrue(b,"search fantion is failed");

    }

    @AfterMethod
    public void closing(){
        driver.quit();

    }
}
