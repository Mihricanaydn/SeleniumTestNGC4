package renastech.Day9;

import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C4_DriverUtilPractice extends TestBase2 {
    //go to google
    //search for hello
    //verify title contains hello

    @Test
    public void TC1_practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox= DriverUtil.getDriver().findElement(By.name("q"));

        String searchItem = PropertiesReadingUtil.getProperties("google_searchData");
        searchBox.sendKeys(searchItem + Keys.ENTER);

        BrowserUtils.wait(2);
        System.out.println(DriverUtil.getDriver().getTitle());
        Assert.assertTrue((DriverUtil.getDriver().getTitle().contains(searchItem)));
    }
}
