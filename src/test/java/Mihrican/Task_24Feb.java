package Mihrican;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_24Feb {

    //go to http://demo.guru99.com/test/newtours/register.php
    // click on country dropdown and select Barbados with Select Method
    //Use 3 different Select Method (visible text,index,value)
    //and switch to another countries as you wish

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class is running");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("After class is running");}

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");}

    @Test
    public void TC1_DropDown() throws InterruptedException {
        System.out.println("TC1 is running");

        WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
        Select slc = new Select(element);
        slc.selectByValue("BARBADOS");
        Thread.sleep(500);
        System.out.println(slc.getFirstSelectedOption().getText() + " using Value");

        element = driver.findElement(By.xpath("//select[@name='country']"));
        slc = new Select(element);
        slc.selectByVisibleText("ANTIGUA AND BARBUDA");
        Thread.sleep(500);
        System.out.println(slc.getFirstSelectedOption().getText() + " using Visible");

        element = driver.findElement(By.xpath("//select[@name='country']"));
        slc = new Select(element);
        slc.selectByIndex(19);
        Thread.sleep(500);
        System.out.println(slc.getFirstSelectedOption().getText() + " using Index");

        element = driver.findElement(By.xpath("//select[@name='country']"));
        slc = new Select(element);
        slc.selectByValue("SWITZERLAND");
        Thread.sleep(500);
        System.out.println(slc.getFirstSelectedOption().getText() + " New Country");

        element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("Mihrican");
        Thread.sleep(500);

        element = driver.findElement(By.xpath("//input[@name='password']"));
        element.sendKeys("1234");
        Thread.sleep(500);

        element = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        element.sendKeys("1234");


    }

    }


