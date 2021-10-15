package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import pageobjects.APTshirtsSectionPage;

public class APTshirtsSectionPageSteps implements En {
  APTshirtsSectionPage tshirtsSectionPage;

  public APTshirtsSectionPageSteps(TestContext context) {
    tshirtsSectionPage = context.getPageObjectManager().getAPTshirtsSectionPage();

    Then(
        "^I should see the tshirts section$",
        () -> {
          tshirtsSectionPage.verifyTshirtsPageTitle();
        });

    When(
        "^I choose medium size$",
        () -> {
          tshirtsSectionPage.chooseMediumSize();
        });

    When(
        "^I add the faded short sleeve tshirt to the cart$",
        () -> {
          tshirtsSectionPage.addFadedTshirtToCart();
        });

    When(
        "^I choose proceed to checkout on tshirts selection page$",
        () -> {
          tshirtsSectionPage.selectProceedToCheckout();
        });
  }
}
