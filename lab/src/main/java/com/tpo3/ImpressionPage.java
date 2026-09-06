package com.tpo3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public final class ImpressionPage {
  private ImpressionPage() {
  }

  public static final By IMPRESSIONS_TAB = By.cssSelector(".s__sii_wON9tIwVoeok:nth-child(3) path:nth-child(1)");
  public static final By CITY_INPUT = By.xpath("//div[@id='guides-main-page']/div[3]/div[2]/span/input");
  public static final By CITY_SUGGESTION = By.xpath("//div[@id='guides-main-page']/section/main/div/li/button/div/div");
  public static final By MAP_MARKER = By.xpath("//div[@id='guides-map']/div[2]/div[9]/div/div");
  public static final By MODAL_THIRD_CARD = By.xpath("//div[@id='avs-modal-container']/div/div/div/div/div/div/div/div/div[2]/div[4]/div/div[2]/div/a[3]/figure/div/div");
  public static final By FAVORITE_BUTTON = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div/div/div[1]/div/div[1]/div/button[1]");
  
  public static final By TIITLE = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[2]/div/div");

  public static final By CLOSE  = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div/button");

  public static final By FAVORITE = By.xpath("//*[@id=\"selene\"]/div/div[1]/div/div[1]/div/nav/ul[1]/li[4]/a");

  public static final By PLACES = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div[2]/div[3]/label/span");
  public static final By PLACE = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div[6]/div");
  public static final By PLACES_DIV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div/div[4]/div");
  public static final By DELETE_FAV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div/div[4]/div/div[1]/div/div[3]/button");
  public static final By EMPTY_DIV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div/div[3]");

  public static String search(WebDriver driver, Map<String, Object> vars) {
    driver.get(Shared.MainPageURL);
    Shared.pause(3000);

    driver.manage().window().setSize(new Dimension(2000, 2000));

    driver.findElement(IMPRESSIONS_TAB).click();
    Shared.pause(2000);

    driver.findElement(CITY_INPUT).click();
    Shared.pause(1000);

    driver.findElement(CITY_INPUT).sendKeys("Москва");
    Shared.pause(1000);

    driver.findElement(CITY_SUGGESTION).click();
    Shared.pause(2000);

    driver.findElement(MAP_MARKER).click();
    Shared.pause(1000);

    String title = driver.findElement(TIITLE).getText();

    return title;
  }


  public static boolean addAndImpressionToFav(WebDriver driver, Map<String, Object> vars) {
    driver.findElement(FAVORITE_BUTTON).click();
    Shared.pause(1000); 

    String title = driver.findElement(TIITLE).getText();

    driver.findElement(CLOSE).click();
    Shared.pause(1000);
    
    return checkImpression(driver, title);
  }

  public static boolean checkImpression(WebDriver driver, String title){ 
    driver.findElement(FAVORITE).click();
    Shared.pause(1000); 

    driver.findElement(PLACES).click();
    Shared.pause(1000); 

    driver.findElement(PLACE).click();
    Shared.pause(1000); 

    String places = driver.findElement(PLACES_DIV).getText();

    return places.toUpperCase().contains(title.toUpperCase());
  } 

  public static boolean deleteAndCheckImpressionFav(WebDriver driver, String title) {
    driver.findElement(CLOSE).click();
    Shared.pause(1000);

    driver.findElement(FAVORITE).click();
    Shared.pause(1000); 

    driver.findElement(PLACES).click();
    Shared.pause(1000); 

    driver.findElement(PLACE).click();
    Shared.pause(1000); 

    driver.findElement(DELETE_FAV).click();
    Shared.pause(1000); 

    String places = driver.findElement(EMPTY_DIV).getText();

    return places.toUpperCase().contains(title.toUpperCase());
  }

}
