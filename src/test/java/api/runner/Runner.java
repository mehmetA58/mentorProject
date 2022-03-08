package api.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Reports/htmlReport.html",
                "json:Reports/jsonReport.json"},
        features="src/test/resources/apiFeature",
        glue="stepdefinitions",
        //dryRun=false,
        tags="@api",
        publish=true
)
public class Runner {

}
