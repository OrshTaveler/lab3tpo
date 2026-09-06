package com.tpo3;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProfilePageTest {
  private static WebDriver driver;
  private static Map<String, Object> vars;
  static JavascriptExecutor js;
  
  @BeforeClass
  public static void setUp() {
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("-profile");
    options.addArguments("/Users/ubica/Library/Application Support/Firefox/Profiles/8pnib0dd.default-esr-1");
    
    driver = new FirefoxDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @AfterClass
  public static void tearDown() {
    driver.quit();
  }

  @Test
  public void test2_addPassport() {
    Shared.mockPerson.put("surname", "Иванов");
    Shared.mockPerson.put("name", "Иван");
    Shared.mockPerson.put("fathername", "Иванович");
    Shared.mockPerson.put("birthday", "01.01.1990");
    Shared.mockPerson.put("document_number", "1234 567890");
    Shared.mockPerson.put("citizenship", "Россия");
    Shared.mockPerson.put("gender", "male");

    ProfilePage.addPassport(driver, vars);  
  }

  @Test 
  public void test3_deletePassport() {
    ProfilePage.deletePassport(driver,vars);
  }

  @Test
  public void test1_addInvalidPassport() {
    Shared.mockPerson.put("surname", "");
    Shared.mockPerson.put("name", "");
    Shared.mockPerson.put("fathername", "");
    Shared.mockPerson.put("birthday", "");
    Shared.mockPerson.put("document_number", "");
    Shared.mockPerson.put("citizenship", "Россия");
    Shared.mockPerson.put("gender", "male");
    
    ProfilePage.addPassport(driver, vars);  
  }

  @Test
  public void test4_addPersonalData() {
    Shared.mockPerson.put("surname", "ИВАН");
    Shared.mockPerson.put("name", "СЕМЁНЫЧ");
    Shared.mockPerson.put("gender", "male");
    Shared.mockPerson.put("phone", "+79124764465");
    Shared.mockPerson.put("email", "mail@mail.com");
    
    ProfilePage.addPersonalData(driver, vars);  
  }

  @Test
  public void test5_notification() {
    ProfilePage.clickNotifications(driver);
  }
}