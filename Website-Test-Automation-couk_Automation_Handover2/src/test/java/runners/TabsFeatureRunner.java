/*package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/HomePage_FeatureFiles/",},
    glue = {"steps"},
    tags = "@tabs",   // 👈 runs only your new feature
    plugin = {
        "pretty",
        "html:target/cucumber-reports/tabs-report.html",
        "json:target/cucumber-reports/tabs-report.json"
    }
)
public class TabsFeatureRunner extends AbstractTestNGCucumberTests {
}
*/