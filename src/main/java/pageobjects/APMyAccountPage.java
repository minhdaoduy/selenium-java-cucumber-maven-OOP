package pageobjects;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;

import selenium.Helper;

public class APMyAccountPage {
  WebDriver driver;
  BaseClass baseClass;

  public APMyAccountPage(WebDriver driver) {
    this.driver = driver;
    baseClass = new BaseClass(driver);
  }

  private String pageTitle = "My account - My Store";

  private String women = "//*[@id='block_top_menu']//a";

  private String tShirts = "//*[@id='block_top_menu']//a[@title='T-shirts']";

  public void verifyMyAccountPageTitle() {
    Helper.verifyTitleContains(driver, pageTitle);
  }

  public void navigateTo_TshirtsPage() {
    baseClass.mouseOver(women);
    baseClass.clickElement(tShirts);
  }
}
