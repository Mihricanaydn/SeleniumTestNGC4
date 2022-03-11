package renastech.Day10;

import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class C2_DropDown extends TestBase2 {

    @Test
    public void Tc1_test(){
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement dropdown = DriverUtil.getDriver().findElement(By.id("countryDropdown"));
        dropdown.sendKeys("Canada");
        BrowserUtils.wait(1);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ENTER);


    }




}
