package Mihrican;

import renastech.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1_Checkbox {

    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        //4. Click to checkbox3
        //5. Verify checkbox3 is selected

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        WebElement CheckBoxElement = driver.findElement(By.xpath("//input[@type='checkbox']"));

        if(!CheckBoxElement.isSelected()){
            System.out.println(" All Checkbox verification has passed ");
        } else {
            System.out.println(" All Checkbox verification has failed");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement CheckBox3 = driver.findElement(By.id("vfb-6-2"));
        CheckBox3.click();

        if(CheckBox3.isSelected()){
            System.out.println("Checkbox3 Verification has passed");
        } else {
            System.out.println(" Checkbox2 Verification has failed");

        }

        }
    }

