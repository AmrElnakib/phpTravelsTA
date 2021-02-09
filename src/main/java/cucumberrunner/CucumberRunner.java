package cucumberrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features/frontpage/AccountPage.feature"},
        glue = {"src/test/java/test.selenium"})

public class CucumberRunner {

}
