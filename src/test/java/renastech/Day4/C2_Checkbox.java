package renastech.Day4;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C2_Checkbox {
    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify checkbox1 is not selected
        //4. Click to checkbox2
        //5. Verify checkbox2 is selected

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));

        if(!checkBox1.isSelected()){
            System.out.println(" Checkbox1 verification has passed");
        }else{
            System.out.println("Checkbox1 selected therefore verification has failed");
        }

        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();
        //5. Verify checkbox2 is selected
        if(checkBox2.isSelected()){
            System.out.println("Checkbox2 Verification has passed");
        }else {
            System.out.println("Checkbox2 Verification has failed");
        }

        Thread.sleep(2000);
        driver.quit();

    }

}
