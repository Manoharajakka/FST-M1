package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\002EYK744\\IdeaProjects\\Fst_selenium\\src\\test\\java\\Features",
        glue = {"stepsDefenition"},
        tags = "@activity2"
)

public class Activity4Runner {
    //empty
}