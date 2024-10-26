package com.qascript.Stepdefs;
import com.qascript.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks extends BaseClass {

    @Before
    public void setup() {

        initializeDriver();

    }

    @After
    public void teardown() {

        closeDriver();


    }
}
