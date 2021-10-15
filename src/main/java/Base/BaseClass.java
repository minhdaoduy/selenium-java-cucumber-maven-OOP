package Base;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;
import selenium.Helper;

import java.io.File;
import java.io.IOException;

public class BaseClass {

	public static WebDriver driver;
	
	public BaseClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	final static Logger log = Logger.getLogger("BaseClass");
	
	
	
	public void clickElement(String how, String locator, int timeout)
	{
		Helper.waitForWebElementEnable(driver,how, locator, timeout).click();
	
	}

	public void clickElement(String locator)
	{
		clickElement("xpath", locator, 20);

	}
	
	public void mouseOver(String mouseElement)
	{
		WebElement element = driver.findElement(By.xpath(mouseElement));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
	}
	
	public String getElementText(String how, String locator, int timeout)
	{
		return Helper.waitForWebElementEnable(driver,how, locator, timeout).getText();
	}

	public String getElementText(String locator)
	{
		return getElementText("xpath", locator, 20);
	}
	
	public boolean isDisplayed(String xpath)
	{
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}

	public void pageRefresh()
	{
		driver.navigate().refresh();
	}

	public void pageBack()
	{
		driver.navigate().back();
	}

	public void pageForward()
	{
		driver.navigate().forward();
	}
	
	public void setText(String how, String locator, String text, int timeout)
	{
		Helper.waitForWebElementEnable(driver,how, locator, timeout).sendKeys(text);
	}

	public void setText(String locator, String text)
	{
		setText("xpath", locator, text, 20);
	}

	public static void screenShot(String fileName) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void PageScrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");

	}

	public void PageScrollup() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-300)", "");
	}
}
