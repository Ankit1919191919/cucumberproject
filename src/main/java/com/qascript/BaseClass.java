package com.qascript;

import com.qascript.Utils.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public  static  void initializeDriver(){
        Properties properties = PropertiesUtil.loadapplicationproperties();
        Properties properties1 = PropertiesUtil.loaduserproperties();

        driver = new ChromeDriver();

        String url = properties.getProperty("application.url").toString();
        driver.get(url);
        driver.manage().window().maximize();
    }


    public static void closeDriver(){

        driver.close();
    }
}
