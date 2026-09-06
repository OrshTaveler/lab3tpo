package com.tpo3;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class ProfilePage {
  private ProfilePage() {
  }
  public static final By DOCUMENTS = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[1]/nav/ul/li[4]/a");
  public static final By CITYZENSHIP = By.xpath("//*[@id=\"downshift-16-input\"]");
  public static final By DOCUMENT_TYPE = By.xpath("//*[@id=\"downshift-18-toggle-button\"]");
  public static final By GENDER_MALE = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/section[1]/form/section/div[2]/div[3]/div/label[1]");
  public static final By GENDER_FEMALE = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/section[1]/form/section/div[2]/div[3]/div/label[2]");
  public static final By SURNAME = By.xpath("//*[@id=\"pf-ln-new-document\"]");
  public static final By NAME = By.xpath("//*[@id=\"pf-fn-new-document\"]");
  public static final By FATHERNAME = By.xpath("//*[@id=\"pf-mn-new-document\"]");
  public static final By BIRTHDAY = By.xpath("//*[@id=\"pf-bd-new-document\"]");
  public static final By DOCUMENT_NUMBER = By.xpath("//*[@id=\"pf-dn-new-document\"]");
  public static final By CONFIRM = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/section[1]/form/section/div[6]/div[2]/button");
  public static final By PASSPORT = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/section[1]/ul/li/div");
  public static final By DELETE_PASSPORT = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div[2]/div/div/form/section/div[6]/div[1]/button");
  public static final By CONFIRM_DELETE_PASSPORT = By.xpath("//*[@id=\"avs-modal-container\"]/div[2]/div/div/div/div/div/div/div[3]/button[2]");

  public static final By PERSONAL_DATA_NAME = By.xpath("//*[@id=\"useaccount_settings_name\"]");
  public static final By PERSONAL_DATA_PHONE = By.xpath("//*[@id=\"profile-phone-number\"]");
  public static final By PERSONAL_DATA_EMAIL = By.xpath("//*[@id=\"profile_settings_email\"]");

  public static final By NOTIFICATION_1 = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/label[1]/div/div[4]/label/span");
  public static final By NOTIFICATION_2 = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/label[2]/div/div[4]/label/span");
  public static final By NOTIFICATION_3 = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/label[1]/div/div[4]/label/span");
  public static final By NOTIFICATION_4 = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/label[2]/div/div[4]/label/span");
  public static final By NOTIFICATION_5 = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/div[3]/label[1]/div/div[4]/label/span");
  public static final By NOTIFICATION_6 = By.xpath("//*[@id=\"selene\"]/div/div[2]/div/div[2]/div[2]/div/div[3]/label[2]/div/div[4]/label/span");
 

  public static void addPassport(WebDriver driver, Map<String, Object> vars) {

    driver.get(Shared.SettingsPageURL);
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(DOCUMENTS));
    driver.manage().window().setSize(new Dimension(2000, 2000));
    Shared.pause(2000);

    
    driver.findElement(DOCUMENTS).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CITYZENSHIP));
    
    driver.findElement(CITYZENSHIP).click();
    Shared.pause(1000);
    driver.findElement(CITYZENSHIP).sendKeys(Shared.mockPerson.get("citizenship"));
    Shared.pause(1000);
    driver.findElement(CITYZENSHIP).sendKeys(Keys.ENTER);
    Shared.pause(1000);
    
    driver.findElement(DOCUMENT_TYPE).click();
    Shared.pause(1000);

    if (Shared.mockPerson.get("gender").equals("male")) {
        driver.findElement(GENDER_MALE).click();
    } else {
        driver.findElement(GENDER_FEMALE).click();
    }
    Shared.pause(1000);
    
    driver.findElement(SURNAME).click();
    Shared.pause(500);
    driver.findElement(SURNAME).sendKeys(Shared.mockPerson.get("surname"));
    Shared.pause(500);
    
    driver.findElement(NAME).click();
    Shared.pause(500);
    driver.findElement(NAME).sendKeys(Shared.mockPerson.get("name"));
    Shared.pause(500);
    
    driver.findElement(FATHERNAME).click();
    Shared.pause(500);
    driver.findElement(FATHERNAME).sendKeys(Shared.mockPerson.get("fathername"));
    Shared.pause(500);
    
    driver.findElement(BIRTHDAY).click();
    Shared.pause(500);
    driver.findElement(BIRTHDAY).sendKeys(Shared.mockPerson.get("birthday"));
    Shared.pause(500);
    driver.findElement(BIRTHDAY).sendKeys(Keys.ENTER);
    Shared.pause(1000);
    
    driver.findElement(DOCUMENT_NUMBER).click();
    Shared.pause(500);
    driver.findElement(DOCUMENT_NUMBER).sendKeys(Shared.mockPerson.get("document_number"));
    Shared.pause(1000);

    driver.findElement(CONFIRM).click();
    Shared.pause(500);
  }

  public static void deletePassport(WebDriver driver, Map<String, Object> vars) {
    driver.findElement(PASSPORT).click();
    Shared.pause(500);

    driver.findElement(DELETE_PASSPORT).click();
    Shared.pause(500);

    driver.findElement(CONFIRM_DELETE_PASSPORT).click();
    Shared.pause(500);
  }

  public static void addPersonalData(WebDriver driver, Map<String, Object> vars) {
    driver.get(Shared.SettingsPageURL);
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(DOCUMENTS));
    driver.manage().window().setSize(new Dimension(2000, 2000));
    Shared.pause(2000);

    driver.findElement(PERSONAL_DATA_NAME).sendKeys(Shared.mockPerson.get("name") + " " + Shared.mockPerson.get("surname"));
    Shared.pause(500);

    driver.findElement(PERSONAL_DATA_PHONE).sendKeys(Shared.mockPerson.get("phone"));
    Shared.pause(500);

    driver.findElement(PERSONAL_DATA_EMAIL).sendKeys(Shared.mockPerson.get("email"));
    Shared.pause(500);
  }

  public static void clickNotifications(WebDriver driver) {
    driver.get(Shared.NotificationPageURL);
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(NOTIFICATION_1));
    driver.manage().window().setSize(new Dimension(2000, 2000));
    Shared.pause(2000);

    driver.findElement(NOTIFICATION_1).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_2).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_3).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_4).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_5).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_6).click();
    Shared.pause(1000);

    driver.findElement(NOTIFICATION_1).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_2).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_3).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_4).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_5).click();
    Shared.pause(500);
    driver.findElement(NOTIFICATION_6).click();
    Shared.pause(1000);
}

}
