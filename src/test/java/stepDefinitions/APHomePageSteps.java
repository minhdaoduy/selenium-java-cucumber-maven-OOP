package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import pageobjects.APHomePage;

public class APHomePageSteps implements En {

  TestContext testContext;
  APHomePage homePage;

  public APHomePageSteps(TestContext context) {

    testContext = context;
    homePage = testContext.getPageObjectManager().getAPHomePage();

    Given(
        "^I want to go to automationpractice website$",
        () -> {
          homePage.navigateTo_ApHomePage();
        });

    Given(
        "^verify the mystore title$",
        () -> {
          homePage.verifyAPHomePageTitle();
        });

    When(
        "^I click on sign in$",
        () -> {
          homePage.navigateTo_LoginPage();
        });
  }
}
