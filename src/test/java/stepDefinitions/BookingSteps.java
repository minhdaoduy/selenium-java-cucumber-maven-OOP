package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java8.En;
import pageobjects.Booking;

public class BookingSteps implements En {
  Booking booking;

  public BookingSteps(TestContext context) {

    booking = context.getPageObjectManager().getBooking();

    Given(
        "^Access booking page$",
        () -> {
          System.out.println("test");
          booking.navigateTo_BookingPage();
        });

    When("^Do some thing$", () -> {});

    Then("^Verify something$", () -> {});
  }
}
