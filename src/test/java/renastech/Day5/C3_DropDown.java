package renastech.Day5;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class C3_DropDown {
    //task1
    //1. Open Chrome browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //confirm default selected dropdown is "Please select an option"
    //task2
    //1. Open Chrome browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //choose  option 2 from dropdown
    //choose option 1 from dropdown
    //choose option 2 from dropdown

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class is running");}

    @AfterClass
    public void AfterClass(){
        System.out.println("After class is running");}
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/"); }

    @Test
    public void TC1_verifyDefaultOptionDropDown(){
        System.out.println("TC1 is running");

        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        WebElement dropDownBox=driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropDownBox);

        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectedDefault="Please select an option ";

        System.out.println("default option is:" + defaultOption);
        Assert.assertEquals(defaultOption, expectedDefault, "default option \nPlease select an option");

    }
    @Test
    public void TC2_verifyOptionFromDropdown() throws InterruptedException {
        System.out.println("TC2 is running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebElement dropDownBox=driver.findElement(By.id("dropdown"));
        Select dropDown = new Select(dropDownBox);
        Thread.sleep(1000);
        dropDown.selectByVisibleText("Option 2");
        Thread.sleep(1000);
        dropDown.selectByValue("1");
        Thread.sleep(1000);
        dropDown.selectByIndex(2);

    }
    @AfterMethod
    public void closing(){
       driver.close();
    }

}
