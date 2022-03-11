package renastech.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class C4_ActionHoverOver extends TestBase2 {

    //go to http://the-internet.herokuapp.com/hovers
    //move mouse to third image
    //verify text of image present on the screen

    @Test
    public void TC1_HoverOver(){
        DriverUtil.getDriver().get("https://the-internet.herokuapp.com/hovers");

        WebElement thirdImage=DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));
        Actions actions = new Actions(DriverUtil.getDriver());
        actions.moveToElement(thirdImage).perform();

        WebElement image3Text = DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        boolean testIsPresent = image3Text.isDisplayed();
        Assert.assertTrue(testIsPresent, "test is not present");

    }


}
