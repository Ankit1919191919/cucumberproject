package com.qascript.Stepdefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.Loginpage;
import com.qascript.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class MyStepdefs extends BaseClass {

    Properties properties;


    @Given("User enters a valid username in the username field")
    public void userEntersAvalidUsernameInTheUsernameField() {

        properties = PropertiesUtil.loadapplicationproperties();
        String username = properties.getProperty("username");



        Loginpage.enterusername(username);



    }

    @And("User enters valid password in password field")
    public void userEntersvalidPasswordInPasswordField() {

        properties = PropertiesUtil.loadapplicationproperties();
        String password = properties.getProperty("password");



        Loginpage.enterpassword(password);

    }


    @When("User click on the login button")
    public void UserClickOnTtheLoginButton(){

        Loginpage.clicklogin();




    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }


    @Given("User enters a invalid username in the username field")
    public void userEntersAInvalidUsernameInTheUsernameField() {
    }

    @And("User enters invalid password in password field")
    public void userEntersInvalidPasswordInPasswordField() {
    }


    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
    }
}
