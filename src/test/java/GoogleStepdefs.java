import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleStepdefs {

    WebDriver driver = new ChromeDriver();

    @Given("browser is opened")
    public void browserIsOpened() {
        //System.out.println("Browser is opened");
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);





    }

    @And("user is on google search page")
    public void userIsOnGoogleSearchPage() {
        System.out.println("user is on google page");
        WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
        if(search.isDisplayed()){
            System.out.println("Search Bar is present");
        }
    }

    @When("user enters any text to search")
    public void userEntersAnyTextToSearch() {
        System.out.println("user enters text to search");
        driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Jon Snow","s");

    }

    @And("hits enter")
    public void hitsEnter() {


        System.out.println("user hits enter");
        driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
    }

    @Then("User is navigated to search results")
    public void userIsNavigatedToSearchResults() {
        System.out.println("user os navigated to the searched page");
        WebElement jon =driver.findElement(By.xpath("(//*[text()='Jon Snow'])[1]"));
        if(jon.isDisplayed()){

            System.out.println("Successfully searched jon snow page");
        }
        String status = String.valueOf(jon.isDisplayed());
        System.out.println(status);

        driver.getTitle().contains("jon snow");


        driver.quit();
    }
}
