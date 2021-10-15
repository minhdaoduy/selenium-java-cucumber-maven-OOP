package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import pageobjects.APOrderConfirmationPage;

public class APOrderConfirmationPageSteps implements En {

  APOrderConfirmationPage orderConfirmationPage;

  public APOrderConfirmationPageSteps(TestContext context) {
    orderConfirmationPage = context.getPageObjectManager().getAPOrderConfirmationPage();

    Then(
        "^I should see order confirmation page$",
        () -> {
          orderConfirmationPage.verifyOrderConfirmationPageTitle();
        });

    Then(
        "^validate the payment amount$",
        () -> {
          orderConfirmationPage.verifyPaymentAmount();
        });
  }
}
