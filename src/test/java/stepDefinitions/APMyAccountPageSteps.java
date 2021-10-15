package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import pageobjects.APMyAccountPage;

public class APMyAccountPageSteps implements En {
  APMyAccountPage myAccountPage;

  public APMyAccountPageSteps(TestContext context) {
    myAccountPage = context.getPageObjectManager().getAPMyAccountPage();

    Then(
        "^I should see the my account page$",
        () -> {
          myAccountPage.verifyMyAccountPageTitle();
        });

    When(
        "^I choose the option women and choose tshirts$",
        () -> {
          myAccountPage.navigateTo_TshirtsPage();
        });
  }
}
