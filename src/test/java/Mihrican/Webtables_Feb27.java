package Mihrican;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Webtables_Feb27 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://money.rediff.com/indices");

    }
    @Test
    public void TC1(){
        driver.findElement(By.id("showMoreLess")).click();
        WebElement webTable =  driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));

        List<WebElement> rows = webTable.findElements(By.tagName("tr"));
        int rowsCount = rows.size();
        for(int i = 0; i<rowsCount; i++){

            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            int columnsCount = columns.size();

            for(int j= 0; j<columnsCount; j++){
                String cellText = columns.get(i).getText();
                if(cellText.equals("S&P BSE 500")){
                    System.out.println(" Prev Close value is :" + columns.get(1).getText() );
                }

            }

        }

    }

}
