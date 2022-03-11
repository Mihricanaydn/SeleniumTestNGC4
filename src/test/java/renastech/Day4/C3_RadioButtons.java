package renastech.Day4;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class C3_RadioButtons {
    public static void main(String[] args) {

        // Navigate to https://courses.letskodeit.com/practice
        // click on BMW RADIO button
        // verify that its selected

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement BMWRadioButton=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BMWRadioButton.click();

        boolean bmwRadioSelected=BMWRadioButton.isSelected();
        if(bmwRadioSelected){
            System.out.println("Bmw is selected");
        }else{
            System.out.println("BMW is not selected, verification has failed");
        }

        WebElement HondaButton=driver.findElement(By.id("hondaradio"));
        if(!HondaButton.isSelected()){
            System.out.println("Honda is not selected");
        }else{
            System.out.println("Honda is not selected, verification has failed");
        }


    }
}
