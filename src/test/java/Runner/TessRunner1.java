package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\sidgo\\IdeaProjects\\SimpleBdd\\src\\test\\resources\\Features",
glue = {"StepDefinitions"},
        dryRun = false


)


public class TessRunner1 {




}
