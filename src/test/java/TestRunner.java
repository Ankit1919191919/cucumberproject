import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/GoogleSearch.feature"},

        plugin = {

        "pretty",
        "html:target/cucumber.html", "json:target/cucumber.json","junit:target/cucumber.xml"


}, publish = true
        , tags = ""


)
public class TestRunner {
}
