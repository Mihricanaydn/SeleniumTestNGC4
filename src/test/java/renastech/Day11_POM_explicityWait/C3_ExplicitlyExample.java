package renastech.Day11_POM_explicityWait;

import renastech.Pages.SeleniumPracticeExplicitlyWaitPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C3_ExplicitlyExample extends TestBase2 {

    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets present

    SeleniumPracticeExplicitlyWaitPage seleniumPracticeExplicitlyWaitPage;


    @Test
    public void TC1_oractice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
        seleniumPracticeExplicitlyWaitPage = new SeleniumPracticeExplicitlyWaitPage();
        seleniumPracticeExplicitlyWaitPage.getDefaultText();
        seleniumPracticeExplicitlyWaitPage.clickTimerButton();

        WebElement actualText=seleniumPracticeExplicitlyWaitPage.getWebDriverText();

        Assert.assertEquals(actualText.getText(),"WebDriver", "WebDriver verification failed");

    }
}
