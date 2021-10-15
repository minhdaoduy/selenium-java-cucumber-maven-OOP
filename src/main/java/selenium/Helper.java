package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Helper{
	
	
	public static void verifyTitleContains(WebDriver driver, String expectedTitle)
	{
		Assert.assertTrue(new WebDriverWait(driver, 30)
				.until(ExpectedConditions.titleContains(expectedTitle)));
		
	}
	
	public static void verifyUrlContains(WebDriver driver, String expectedURL)
	{
	   Assert.assertTrue(new WebDriverWait(driver, 30)
			   .until(ExpectedConditions.urlContains(expectedURL)));
	}
	
	public static void verifyUrlContainsSoftAssert(WebDriver driver, String expectedURL)
	{
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains(expectedURL)));
		softAssert.assertAll();
	}
	public static By getLocator(WebDriver driver, String how, String locator, int time)
	{
		switch (how) {
			case "xpath":
				return By.xpath(locator);
			case "css":
				return By.cssSelector(locator);
			case "name":
				return By.name(locator);
			case "id":
				return By.id(locator);
			case "class":
				return By.className(locator);
			default: return By.linkText(locator);
		}
	}

	public static WebElement waitForWebElementEnable(WebDriver driver, String how, String locator, int time)
	{
		By by = getLocator(driver,how, locator,time);
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(by));

	}

	public static WebElement waitForElementPresent(WebDriver driver, String how, String locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}

	public static boolean verifyElementEnable(WebDriver driver, String how, String locator, String status, int timeout){
		waitForElementPresent(driver,how,locator,60);
		By by = getLocator(driver,how, locator,timeout);
		switch (status) {
			case "enabled":
				return  driver.findElement(by).isEnabled();
			case "displayed":
				return  driver.findElement(by).isDisplayed();
			default: return  driver.findElement(by).isSelected();
		}
	}





	public static WebElement waitForWebElement(WebDriver driver, By by,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	// This is only required when you want to highlight the webelement
	public static WebElement syncWebElement(WebDriver driver,WebElement element)
	{
	
	 WebElement ele= waitForWebElement(driver, element, 20);
		
	 WebElement ele1=highLightElement(driver, ele);
	 
	 return ele1;
	 
	}
	
	// use this always if you don't want to highlight the elements
	public static WebElement waitForWebElement(WebDriver driver, WebElement element,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement dummy(WebDriver driver, WebElement element,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement highLightElement(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

		return element;
	}


}
