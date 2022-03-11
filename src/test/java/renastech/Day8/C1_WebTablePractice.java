package renastech.Day8;

import renastech.utilities.SmartBearUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1_WebTablePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void Tc1_StreetVerification() {
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
        Password.sendKeys("test");
        WebElement Login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
        Assert.assertEquals(driver.getTitle(), "Web Orders");
    }

    @Test(dataProvider = "TestDataForStreetName")
    public void TC2_streetVerification(String streetName) {
        SmartBearUtils.LogInForSmartBear(driver);
        SmartBearUtils.verifyStreet(driver, streetName);

    }

    @DataProvider(name="TestDataForStreetName")
    public static Object [][] test(){
        return new Object[][]{
                {"17, Park Avenue"},
                {"44, Nibluck"},
                {"Good morning"},
                {"45, Stone st."}

        };
    }
}
