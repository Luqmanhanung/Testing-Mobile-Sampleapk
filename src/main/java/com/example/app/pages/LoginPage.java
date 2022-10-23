package com.example.app.pages;
import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
//    By locator = MobileBy.id("username");
//    AndroidElement tfUsername = driver.findElement(locator);
//    tfUsername.clear();
//    tfUsername.sendKeys(username);
    type(MobileBy.id("username"), username);
  }

  public void inputPassword(String password) {
//    By locator = MobileBy.id("password");
//    AndroidElement tfPassword = driver.findElement(locator);
//    tfPassword.clear();
//    tfPassword.sendKeys(password);
    type(MobileBy.id("password"), password);
  }

  public void clickLoginBtn() {
//    By locator = MobileBy.id("login");
//    AndroidElement btnLogin = driver.findElement(locator);
//    btnLogin.click();
    click(MobileBy.id("login"));
  }
  public boolean checkErrorMessageAppear() {
    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }
  public boolean checkTitleApp(){
    By locator = MobileBy.xpath("//android.widget.TextView[@text=\"Simple App\"]");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }
}
