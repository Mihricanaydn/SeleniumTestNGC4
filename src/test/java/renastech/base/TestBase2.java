package renastech.base;

import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {

    @BeforeMethod
    public void  setUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(3);
     //   DriverUtil.closeDriver();

    }


}
