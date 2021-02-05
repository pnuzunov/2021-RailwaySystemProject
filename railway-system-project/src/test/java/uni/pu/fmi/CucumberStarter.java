package uni.pu.fmi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", plugin = {"pretty", "html:target/cucmberRaport"})

public class CucumberStarter {

}
