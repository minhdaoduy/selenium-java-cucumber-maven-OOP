package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import pageobjects.APOrderPage;

public class APOrderPageSteps implements En {

  APOrderPage orderPage;

  public APOrderPageSteps(TestContext context) {
    orderPage = context.getPageObjectManager().getAPOrderPage();

    Then(
        "^I should see my order page$",
        () -> {
          orderPage.verifyOrderPageTitle();
        });

    When(
        "^I choose proceed to checkout on order page$",
        () -> {
          orderPage.selectProceedToCheckOut();
          orderPage.selectProceedToCheckOut();
          orderPage.agreeTermsAndConditions();
          orderPage.selectProceedToCheckOut();
        });

    When(
        "^I choose the payment method cheque$",
        () -> {
          orderPage.selectPayByCheckMethod();
        });

    When(
        "^I confirm my order$",
        () -> {
          try {
            orderPage.selectConfirmMyOrder();
          } catch (Error e) {
            throw new RuntimeException(e);
          }
        });
  }
}
