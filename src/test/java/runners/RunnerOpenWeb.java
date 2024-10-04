package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/openweb.feature",
        glue = "src/test/java/stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@OpenWeb"
)
public class RunnerOpenWeb {
}
