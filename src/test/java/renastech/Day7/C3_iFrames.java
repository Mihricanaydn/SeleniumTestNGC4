package renastech.Day7;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C3_iFrames {
    //Open a chrome browser
    //Go to "https://renas-practice.herokuapp.com/home"
    //Switching by id or name attribute value

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
    }

    @Test
    public void TC1_iFrame(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement MessageBox= driver.findElement(By.id("tinymce"));
        MessageBox.clear();
        MessageBox.sendKeys("This is best Renas-tech class ever");

        driver.switchTo().defaultContent(); // return to the min html
        // driver.switchTo().parentFrame();

    }

}
