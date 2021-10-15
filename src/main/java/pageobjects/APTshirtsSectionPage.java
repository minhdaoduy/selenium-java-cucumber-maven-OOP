package pageobjects;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;

import selenium.Helper;

public class APTshirtsSectionPage {
	WebDriver driver;
	BaseClass baseClass;
	
	public APTshirtsSectionPage(WebDriver driver)
	{
		this.driver = driver;
		baseClass = new BaseClass(driver);
	}
	
	public String tshirtMediumSize = "//a[contains(text(),'M')]";
	
	public String pageTitle = "T-shirts - My Store";
	
	public String mouseoverFadedTshirt = "//a/img[@title='Faded Short Sleeve T-shirts']";
	
	public String addToCart = "//span[contains(text(),'Add to cart')]";
	
	public String proceedToCheckout = "//*[@id='layer_cart']//span[contains(text(),'Proceed to checkout')]";
	
	public void verifyTshirtsPageTitle()
	{
		Helper.verifyTitleContains(driver, pageTitle);
	}
	
	public void chooseMediumSize()
	{
		baseClass.clickElement(tshirtMediumSize);
	}
	
	public void addFadedTshirtToCart()
	{
		baseClass.mouseOver(mouseoverFadedTshirt);
		baseClass.clickElement(addToCart);
	}
	
	public void selectProceedToCheckout()
	{
		baseClass.clickElement(proceedToCheckout);
	}

}
