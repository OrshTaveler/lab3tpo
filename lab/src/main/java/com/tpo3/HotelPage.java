package com.tpo3;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class HotelPage {
  private HotelPage() {
  }

  public static final By SEARCH_BUTTON = By.xpath(".s__mHigRYQNLncSEc34");
  public static final By RESULT_CARD = By.cssSelector(".s__nk32NUSrM_EgTUEA");

  public static final By HOTELS = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[2]/nav/ul[1]/li[2]/a");
  public static final By CITY = By.xpath("//*[@id=\"hotel_autocomplete-input\"]");

  public static final By DATE_FROM = By.xpath("//*[@id=\"selene\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/form/div[2]/div[1]/div[2]/button[1]");
  public static final By DATE_TO = By.xpath("//*[@id=\"selene\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/form/div[2]/div[1]/div[2]/button[2]");

  public static final By DATE_FROM_BUTTON = By.xpath("//*[@id=\"selene\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div/div[3]/table/tbody/tr[5]/td[2]/button");
  public static final By DATE_TO_BUTTON = By.xpath("//*[@id=\"selene\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div/div[3]/table/tbody/tr[5]/td[3]/button");

  public static final By SEARCH = By.xpath("//*[@id=\"selene\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/form/div[4]/button");

  public static final By HOTEL_FAVORITE = By.xpath("//*[@id=\"selene\"]/div/div/div[3]/div/div[4]/div/div[2]/div/div[3]/div/a[2]/div[2]/div[1]/div[2]/button");
  
  public static final By HOTEL_FILTER = By.xpath("//*[@id=\"selene\"]/div/div/div[3]/div/div[3]/div/div/div/div[4]/div[2]/div/div/div/div[4]/div[2]/div[1]");

  public static final By FAVORITE = By.xpath("//*[@id=\"selene\"]/div/div/div[1]/div/div[1]/div/nav/ul[1]/li[4]/a");
  public static final By HOTEL = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div[2]/div[2]/label/span/div");

  public static final By PLACES = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div[5]/div/div/div/div[1]");
  public static final By PLACE = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/a/div[1]/div[4]/div/button");
  public static final By PLACES_DIV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div/div[4]/div");
  public static final By DELETE_FAV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div/div[4]/div/div[1]/div/div[3]/button");
  public static final By EMPTY_DIV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div/div[3]");


  public static void search(WebDriver driver, Map<String, Object> vars) {

    driver.get(Shared.MainPageURL);
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(HOTELS));
    driver.manage().window().setSize(new Dimension(2000, 2000));
    
    driver.findElement(HOTELS).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CITY));

    driver.findElement(CITY).click();
    Shared.pause(1000);

    driver.findElement(CITY).sendKeys("Санкт-Петербург");
    Shared.pause(1000);

    driver.findElement(DATE_FROM).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DATE_FROM_BUTTON));

    driver.findElement(DATE_FROM_BUTTON).click();
    Shared.pause(1000);

    driver.findElement(DATE_TO).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DATE_TO_BUTTON));

    driver.findElement(DATE_TO_BUTTON).click();
    Shared.pause(1000);
    
    driver.findElement(SEARCH).click();
    Shared.pause(10000); 
  }


  public static void addToFav(WebDriver driver, Map<String, Object> vars) {
    driver.findElement(HOTEL_FAVORITE).click();
    Shared.pause(1000);  
  }

  public static void checkFav(WebDriver driver) {
    driver.findElement(FAVORITE).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(HOTEL));

    driver.findElement(HOTEL).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PLACES));

    driver.findElement(PLACES).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PLACE)); 
  }

  public static void deleteFav(WebDriver driver) {
    driver.findElement(PLACE).click();
    Shared.pause(1000); 
  }

  public static void filter(WebDriver driver, Map<String, Object> vars) {
    Shared.pause(10000); 
    driver.findElement(HOTEL_FILTER).click();
    Shared.pause(1000); 
  }

}
