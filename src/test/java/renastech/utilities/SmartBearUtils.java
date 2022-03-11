package renastech.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void LogInForSmartBear(WebDriver driver) {

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
        Password.sendKeys("test");
        WebElement Login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();

    }

    public static void negativeLoginForSmartBear(WebDriver driver, String userID, String passwordID) {

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        //invalid username
        username.sendKeys(userID);
        //Enter password --- invalid password
        WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
        Password.sendKeys(passwordID);
        //Click Login button
        WebElement Login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
    }

    public static void verifyStreet(WebDriver driver, String streetName) {

        //to locate all table //table[@id='ctl00_MainContent_orderGrid']
        //to locate all table row table[@id='ctl00_MainContent_orderGrid']//tr
        //to locate 4. row //table[@id='ctl00_MainContent_orderGrid']//tr[4]
        //to locate all street //table[@id='ctl00_MainContent_orderGrid']//tr//td[6]
        List<WebElement> streetList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));

        for (WebElement eachStreet : streetList) {

            if (eachStreet.getText().equals(streetName)) {
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;
            }
        }

        Assert.fail("Street name:" + streetName + "is not present on the table");

    }
}
