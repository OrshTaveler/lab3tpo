package com.tpo3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FavoriteTest {
  private WebDriver driver;
  private Map<String, Object> vars;

  @Before
  public void setUp() {
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("-profile");
    options.addArguments("/Users/ubica/Library/Application Support/Firefox/Profiles/8pnib0dd.default-esr-1");

    driver = new FirefoxDriver(options);
    vars = new HashMap<>();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void addTicketToFav() {
    TicketPage.search(driver, vars);
    String title = TicketPage.favorite(driver, vars);
    assertEquals(title, TicketPage.checkFav(driver, vars));
  }

  @Test
  public void deleteTicketFromFav() {
    TicketPage.search(driver, vars);
    TicketPage.checkFav(driver, vars);
    assertEquals(Shared.EmptyFav, TicketPage.deleteFav(driver, vars));
  }

  @Test
  public void addHotelToFav() {
    HotelPage.search(driver, vars);
    HotelPage.addToFav(driver, vars);
    HotelPage.checkFav(driver);
  }

  @Test
  public void deleteHotelFromFav() {
    HotelPage.search(driver, vars);
    HotelPage.checkFav(driver);
    HotelPage.deleteFav(driver);
  }

  @Test
  public void addImpressionToFav() {
    ImpressionPage.search(driver, vars);
    assertTrue(ImpressionPage.addAndImpressionToFav(driver, vars));
  }

  @Test
  public void deleteImpressionToFav() {
    String title = ImpressionPage.search(driver, vars);
    assertFalse(ImpressionPage.deleteAndCheckImpressionFav(driver, title));
  }
}
