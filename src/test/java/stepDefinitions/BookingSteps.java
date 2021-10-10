package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageobjects.Booking;
import testDataTypes.Customer;

public class BookingSteps {

	TestContext testContext;
	Booking booking;

	public BookingSteps(TestContext context) {
		testContext = context;
		booking = testContext.getPageObjectManager().getBooking();
	}

	@Given("^Access booking page$")
	public void access_booking_page() throws Throwable {
		booking.navigateTo_BookingPage();
	}

	@When("^Do some thing$")
	public void do_some_thing() throws Throwable {
//		loginPage.clickLoginButton();
	}

	@Then("^Verify something$")
	public void verify_something() throws Throwable {
//		loginPage.verifyReaderPageTitle();
	}

}
