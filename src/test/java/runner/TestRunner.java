package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/Features/taging.feature",
        glue = {"StepDefinations"}
//        tags={"~@SmokeTest"}
              )
public class TestRunner {

}
