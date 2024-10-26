import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User enters a valid username in the username field")
    public void userEntersAValidUsernameInTheUsernameField() {

        System.out.println("User enters a valid username in the username field");
    }

    @And("User enters valid password in password field")
    public void userEntersValidPasswordInPasswordField() {

        System.out.println("User enters valid password in password field");
    }

    @When("User click on the login button")
    public void userClickOnTheLoginButton() {
        System.out.println("User click on the login button");
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {

        System.out.println("User is logged in successfully");
    }

}
