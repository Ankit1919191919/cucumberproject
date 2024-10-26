package com.qascript.PageObjects;
import com.qascript.BaseClass;
import org.openqa.selenium.By;

public class Loginpage extends BaseClass{

    private static String txtusername = "(//input)[1]";
    private static String txtpassword="(//input)[2]";
    private static String loginbutton="//input[@id='login-button']";


    public static void enterusername(String username){

        driver.findElement(By.xpath(txtusername)).sendKeys(username);

    }


    public  static void enterpassword(String password){

        driver.findElement(By.xpath(txtpassword)).sendKeys(password);


    }

    public static void clicklogin(){

        driver.findElement(By.xpath(loginbutton)).click();

    }
}
