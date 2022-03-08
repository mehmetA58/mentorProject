package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports2.html",
                "json:target/json-reports/Pcucumber2.json",
                "junit:target/xml-report/Pcucumber2.xml"},
        features="src/test/resources/uiFeature",
        glue="ui/stepdefinitions",
        tags="@Parallel2"  ,

        dryRun= false

)

public class ParallelTestRunner2 {
}
