package com.tpo3;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public final class TicketPage {
  private TicketPage() {
  }
  public static final By FROM_BUTTON = By.xpath("//*[@id=\"avia_form_origin-input\"]");
  public static final By SEARCH_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/form/div[2]/button");
  public static final By RESULT_FAVORITE_BUTTON = By.xpath("//div[@id='selene']/div/div[2]/div[3]/div/div[4]/div/div/div/div[11]/div/div/div[2]/div/div[3]/div/button");
  public static final By RESULT_FAVORITE_ACTION_BUTTON = By.xpath("//div[@id='selene']/div/div[2]/div[3]/div/div[4]/div/div/div/div[11]/div/div/div[2]/div/div[3]/div/div/button");
  public static final By RESULT_FAVORITE_ACTION_ICON = By.cssSelector(".div.s__zW3z5TpW06UmiJLL:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");
  public static final By FAVORITES_NAV_ITEM = By.xpath("//div[@id='selene']/div/div/div/div/div/div/nav/ul/li[4]/a/div[2]");
  public static final By FAVORITE_CARD_ACTION_BUTTON = By.xpath("//div[@id='selene']/div/div/div[2]/div[4]/div[3]/section/div[2]/div/div/div/div/div[2]/div/div/button");
  public static final By TO_BUTTON = By.xpath("//div[2]/div/div/input");
  public static final By DEPARTURE_DATE_BUTTON = By.cssSelector("button.s__FKGQiCyHcJMheaAN:nth-child(1)");
  public static final By DEPARTURE_DATE = By.cssSelector("div.s__vY0Kp_7_YUAgIkqP:nth-child(3) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(7) > div:nth-child(1) > button:nth-child(1)");
  public static final By RETURN_DATE_PANEL_NEXT_BUTTON = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div[2]/div/div/div/div/div/div[2]/div/button[2]");
  public static final By RETURN_DATE_BUTTON = By.cssSelector("button.s__FKGQiCyHcJMheaAN:nth-child(2)");
  public static final By RETURN_DATE = By.cssSelector(".s__TDy7hAs6LyQ7iMXM");
  public static final By PASSAGER_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/form/div[2]/button");
  public static final By PLUS_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/div[3]/button");
  public static final By PLUS_CHILD_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div[3]/div[2]/div[3]/button");
  public static final By PLUS_BABY_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div[3]/button");
  public static final By MINUS_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/button");

  public static final By TICKET = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[4]/div/div/div[1]/div[4]");
  public static final By FAVORITE = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/div[3]/div/div/div/button");
  public static final By CLOSE = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div[1]/div/div/div[1]/div/button");
  
  public static final By NO_LAYOVERS = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[3]/div/div[2]/div/div/div[4]/div[2]/div/div[1]/div/div[1]/div[2]/div[1]/span");

  public static final By FAVORITE_PAGE = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[1]/div/nav/ul[1]/li[4]/a/div[2]");
  public static final By TICKET_DIV_TITLE = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[4]/div[3]/section/div[1]/div/div[2]/div");
  public static final By TITLE_TICKET = By.xpath("//*[@id=\"avs-modal-container\"]/div/div/div/div/div[2]/div/div[1]/div[3]/div[1]/div[1]");
  public static final By FAVORITE_BUTTON_IN_DIV = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[4]/div[3]/section/div[2]/div/div/div/div[1]/div[2]/div/div/button");
  public static final By EMPTY_FAV = By.xpath("//*[@id=\"selene\"]/div/div[1]/div[2]/div[4]/div[2]/div[1]/div/div[2]");
  public static void search(WebDriver driver, Map<String, Object> vars) {
  
    driver.get(Shared.MainPageURL);
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FROM_BUTTON));
    driver.manage().window().setSize(new Dimension(2000, 2000));

    driver.findElement(FROM_BUTTON).click();
    Shared.pause(1000);
    
    driver.findElement(FROM_BUTTON).sendKeys("Санкт-Петербург");
    Shared.pause(1000);

    driver.findElement(FROM_BUTTON).sendKeys(Keys.ENTER);
    Shared.pause(1000);

    driver.findElement(TO_BUTTON).sendKeys("Шереметьево");
    Shared.pause(1000);
   
    driver.findElement(DEPARTURE_DATE_BUTTON).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DEPARTURE_DATE));
   
    driver.findElement(DEPARTURE_DATE).click();
    Shared.pause(1000);
    
    driver.findElement(RETURN_DATE_BUTTON).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(RETURN_DATE));
    
    {
      WebElement element = driver.findElement(RETURN_DATE_BUTTON);
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    
    driver.findElement(RETURN_DATE).click();
    Shared.pause(1000);
   
    driver.findElement(SEARCH_BUTTON).click();
    Shared.pause(10000);
  }

  public static String favorite(WebDriver driver, Map<String, Object> vars) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.presenceOfElementLocated(TICKET));
    driver.findElement(TICKET).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FAVORITE));
    String title = driver.findElement(TITLE_TICKET).getText();
    driver.findElement(FAVORITE).click();
    Shared.pause(5000);
    driver.findElement(CLOSE).click();
    Shared.pause(1000);

    return title;
  }

  public static String checkFav(WebDriver driver, Map<String, Object> vars) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.presenceOfElementLocated(FAVORITE_PAGE));
    driver.findElement(FAVORITE_PAGE).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(TICKET_DIV_TITLE));
    Shared.pause(5000);
    return driver.findElement(TICKET_DIV_TITLE).getText();

  }

  public static String deleteFav(WebDriver driver, Map<String, Object> vars) {
    
    driver.findElement(FAVORITE_BUTTON_IN_DIV).click();
    new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(EMPTY_FAV));
    return driver.findElement(EMPTY_FAV).getText();
  }

  public static void filter(WebDriver driver, Map<String, Object> vars) {
    Shared.pause(5000);
    driver.findElement(NO_LAYOVERS).click();
    Shared.pause(5000);
  }
}