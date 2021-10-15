package pageobjects;


import Base.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Booking {
	WebDriver driver;
	BaseClass baseClass;

	public Booking(WebDriver driver)
	{
		this.driver = driver;
		baseClass = new BaseClass(driver);
	}

	final static Logger log = Logger.getLogger("Booking");

//	public String username = "//input[@name='usernameOrEmail']";
//
//	public String password = "//input[@name='password']";
	public String url = "https://www.booking.com/index.vi.html";



	public void navigateTo_BookingPage() {
		driver.get(url);
	}

//	public void loginOperation(Customer customer)
//	{
//		typeUserName(customer.username);
//		clickUserNameContinueButton();
//		typePassword(customer.password);
//	}
//
//	public void verifyLoginPageTitle()
//	{
//
//		log.info("Login page title is verifying");
//		Helper.verifyTitleContains(driver, loginPageTitle);
//		Assert.assertEquals(baseClass.getTitle(), loginPageTitle);
//		log.info("Login page title is verified");
//	}
//
//	public void verifyReaderPageTitle()
//	{
//		log.info("Reader page title is verifying");
//		Helper.verifyTitleContains(driver, readerPageTitle);
//		Assert.assertEquals(baseClass.getTitle(), readerPageTitle);
//		log.info("Reader page title is verifying");
//	}
//
//	public void typeUserName(String uname)
//	{
//		log.info("Enter the username");
//		baseClass.setTextByXpath(username,uname);
//		log.info("Entered the username");
//	}
//
//	public void clickUserNameContinueButton()
//	{
//		log.info("Username continue button is clicking");
//		baseClass.clickByXpath(usernamecontinue_button);
//		log.info("Username continue button is clicked");
//	}
//
//	public void typePassword(String pword)
//	{
//		log.info("Enter the password");
//		baseClass.setTextByXpath(password,pword);
//		log.info("Entered the password");
//	}
//
//	public void clickLoginButton()
//	{
//		log.info("Login button is clicking");
//		baseClass.clickByXpath(login);
//		log.info("Login button is clicked");
//	}

}
