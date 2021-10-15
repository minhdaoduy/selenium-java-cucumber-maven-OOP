package pageobjects;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;

import selenium.Helper;

public class APOrderPage {
	WebDriver driver;
	BaseClass baseClass;
	
	public APOrderPage(WebDriver driver)
	{
		this.driver = driver;
		baseClass = new BaseClass(driver);
	}
	
	public String pageTitle = "Order - My Store";
	
	public String proceedToCheckout = "//*[@id='center_column']//span[contains(text(),'Proceed to checkout')]";
	
	public String readTheTerms = "//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]";
	
	public String payByCheck = "//a[contains(text(),'Pay by check ')]";
	
	public String confirmOrder = "//span[contains(text(),'I confirm my order')]";
	
	public void verifyOrderPageTitle()
	{
		Helper.verifyTitleContains(driver, pageTitle);
	}
	
	public void selectProceedToCheckOut()
	{
		//WebElement body = driver.findElement(By.cssSelector("body"));
		//body.sendKeys(Keys.PAGE_DOWN);
		baseClass.clickElement(proceedToCheckout);
	}
	
	public void agreeTermsAndConditions()
	{
		baseClass.clickElement(readTheTerms);
	}
	
	public void selectPayByCheckMethod()
	{
		baseClass.clickElement(payByCheck);
	}
	
	public void selectConfirmMyOrder()
	{
		baseClass.clickElement(confirmOrder);
	}

}
