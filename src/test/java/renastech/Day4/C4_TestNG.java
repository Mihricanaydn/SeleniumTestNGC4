package renastech.Day4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C4_TestNG {

@BeforeMethod
    public void setup(){
    System.out.println("Before Method is Running");}
@AfterMethod
    public void closing(){
    System.out.println("After Method is Running");}

    @Test
    public void TCq_test(){
        System.out.println("Test 1 is running");}
    @Test
    public void TC2_test(){
        System.out.println("Test 2 is running");
    }
    @Test
    public void TC3_test(){
        System.out.println("Test 3 is running");
    }

    }








