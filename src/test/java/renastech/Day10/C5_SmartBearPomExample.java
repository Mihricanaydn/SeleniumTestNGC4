package renastech.Day10;

import renastech.Pages.SmartBearLoginPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class C5_SmartBearPomExample extends TestBase2 {

    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPositiveVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),PropertiesReadingUtil.getProperties("SmartBear_password"));
    }


}
