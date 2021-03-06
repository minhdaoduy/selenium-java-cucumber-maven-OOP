package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
// (features="src/test/resources/functionalTests",
// (
//    features = "src/test/resources/functionalTests/Login.feature",
// (
//    features = "src/test/resources/functionalTests/Purchase.feature",
(
    features = "src/test/resources/functionalTests/Booking.feature",
    glue = {"stepDefinitions"},
//         tags = {"@debug"},
    plugin = {
      "pretty",
      "json:target/cucumber-reports/Cucumber.json",
      "junit:target/cucumber-reports/Cucumber.xml",
      "html:target/cucumber-reports"
    },
    monochrome = true)
public class TestRunner {}
