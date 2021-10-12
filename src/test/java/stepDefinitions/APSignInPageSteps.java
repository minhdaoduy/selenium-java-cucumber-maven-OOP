package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import managers.FileReaderManager;
import pageobjects.APSignInPage;
import testDataTypes.Customer;

public class APSignInPageSteps implements En {
  TestContext testContext;
  APSignInPage signInPage;

  public APSignInPageSteps(TestContext context) {
    testContext = context;
    signInPage = testContext.getPageObjectManager().getAPSignInPage();

    Then(
        "^I should see the login page$",
        () -> {
          signInPage.verifySignInPageTitle();
        });

    When(
        "^I enter \"([^\"]*)\" login credentials$",
        (String customerName) -> {
          Customer customer =
              FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
          signInPage.signInOperation(customer);
        });
  }
}
