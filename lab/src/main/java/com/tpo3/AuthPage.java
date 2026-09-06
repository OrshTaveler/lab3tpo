package com.tpo3;

import java.time.Duration;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class AuthPage {
  private AuthPage() {
  }


  public static final By PROFILE_BUTTON = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/span/button/div[2]");
  public static final By SIGNIN_BUTTON = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div/button");
  public static final By DROP_BUTTON = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div[2]/div/div/div[2]/div[1]/button[3]");
  public static final By YANDEX_BUTTON = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div[2]/div/div/div[2]/div[3]/button[4]");


  public static void login(WebDriver driver, Map<String, Object> vars) {
    driver.get(Shared.MainPageURL);
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PROFILE_BUTTON));
    driver.manage().window().setSize(new Dimension(2000, 2000));
    driver.findElement(PROFILE_BUTTON).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SIGNIN_BUTTON));
    driver.findElement(SIGNIN_BUTTON).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DROP_BUTTON));
    driver.findElement(DROP_BUTTON).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(YANDEX_BUTTON));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(YANDEX_BUTTON).click();
    Shared.pause(3000);
    vars.put("win4927", waitForWindow(driver, vars, 2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("root").toString());
    Shared.pause(3000);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(PROFILE_BUTTON)).click();
  }


  public static void signout(WebDriver driver, Map<String, Object> vars) {
    Shared.pause(3000);
    driver.manage().window().setSize(new Dimension(2000, 2000));
    driver.findElement(PROFILE_BUTTON).click();
    Shared.pause(1000);
    driver.findElement(SIGNIN_BUTTON).click();
    Shared.pause(1000);
  }

  private static String waitForWindow(WebDriver driver, Map<String, Object> vars, int timeout) {
    Shared.pause(timeout);
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }

}
