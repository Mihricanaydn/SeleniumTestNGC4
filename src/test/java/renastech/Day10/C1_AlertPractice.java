package renastech.Day10;

import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C1_AlertPractice extends TestBase2 {
    /*
   Go to "http://the-internet.herokuapp.com/"
   click JavaScript Alerts
   Click for Js Prompt
   Enter "hello word" text
   Click okay
   Validate your text appearing on the page
   */

    @Test
    public void AllertPractice() throws InterruptedException {
        DriverUtil.getDriver().get("https://the-internet.herokuapp.com/");
       WebElement jsAlertLink = DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsAlertLink.click();

       WebElement JsPromptLink =DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
       JsPromptLink.click();

       Alert alert = DriverUtil.getDriver().switchTo().alert();

       String word = "Hello world";
        alert.sendKeys(word);
        BrowserUtils.wait(5);
        alert.accept();

        WebElement actualtext = DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualtext.getText().contains(word));

    }

    }