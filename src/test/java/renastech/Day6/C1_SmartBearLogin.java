package renastech.Day6;

import renastech.utilities.BrowserUtils;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1_SmartBearLogin {

    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click "Login" button
    //6- Verify title equals: Web Orders

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1- Open a chrome browser
        // 2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    driver= WebDriverUtil.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");}

    @AfterMethod
    public void cloing(){
        BrowserUtils.wait(2);}

    @Test
    public void TC1_LoginVerification() {
        //3- Enter username --->Tester
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
        Password.sendKeys("test");
        WebElement Login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
        //6- Verify title equals: Web Orders

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void TC2_LogInVerification(){
        SmartBearUtils.LogInForSmartBear(driver);
        Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Login");
    }

    }


