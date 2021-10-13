package stepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
  TestContext testContext;

  public Hooks(TestContext context) {

    testContext = context;
  }

  @Before
  public void beforeScenario(Scenario scenario) {
    System.out.println("test context: " + testContext);
    // Reporter.assignAuthor("praveendandu");
    //    WebDriverManager webDriverManager = new WebDriverManager();
  }

  @After
  public void closeApplication(Scenario scenario) {
    testContext.getWebDriverManager().quitDriver(scenario);
  }
}
