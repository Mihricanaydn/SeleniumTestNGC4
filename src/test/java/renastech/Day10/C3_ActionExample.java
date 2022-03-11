package renastech.Day10;

import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C3_ActionExample extends TestBase2 {

    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double click button
    //then accept the alert that pops up

    Actions actions;


    @Test
    public void TC1_doubleClick(){
        DriverUtil.getDriver().get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement doubleClickButton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions = new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleClickButton).perform();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();
    }

    @Test
    public void TC2_rightClick(){
     //go to http://demo.guru99.com/test/simple_context_menu.html
    //right click to right click button
    //then click on edit button
    //then accept the allert that pops up

        DriverUtil.getDriver().get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClick=DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        actions = new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClick).perform();

        WebElement editButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']"));
        editButton.click();
        BrowserUtils.wait(2);
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.accept();


    }

    //go to http://demo.guru99.com/test/drag_drop.html
    //drag bank word to account section and drop it
    //then drag 5000 to amount  section and drop it

    @Test
    public void TC3_DragDrop(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        WebElement dragFrom=DriverUtil.getDriver().findElement(By.xpath("credit2"));
        WebElement dropTo=DriverUtil.getDriver().findElement(By.xpath("//ol[id='bank']/li"));
        actions=new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom,dropTo).perform();

        //then drag 5000 to amount  section and drop it
        //2 things needs to be done here
        //first specify location of drag
        //secon specify location of drop

        WebElement dragFrom2=DriverUtil.getDriver().findElement(By.id("fourth"));
        WebElement dropTo2=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']//li"));
        actions.dragAndDrop(dragFrom2,dropTo2).perform();


    }

}
