package com.tpo3;

import org.openqa.selenium.By;

public final class MainPage {
  private MainPage() {
  }

  public static final By TOP_PANEL = By.xpath("//div[@id='selene']/div/div/div[2]/div/div/div/div");
  public static final By PROFILE_MENU_ICON = By.xpath("//div[@id='selene']/div/div/div/div/div[2]/div/div/span/button/div[2]");
  public static final By PROFILE_MENU_BUTTON = By.xpath("//div[@id='selene']/div/div/div/div/div[2]/div/div/span/button");
  public static final By AUTH_BUTTON = By.xpath("//div[@id='selene']/div/div/div/div/div[2]/div/div/div/div/div/div/button");
  public static final By MORE_AUTH_METHODS_BUTTON = By.xpath("//div[@id='avs-modal-container']/div/div/div/div/div[2]/div/div/div[2]/div/button[3]");
  public static final By YANDEX_AUTH_BUTTON = By.xpath("//div[@id='avs-modal-container']/div/div/div/div/div[2]/div/div/div[2]/div[3]/button[4]");
  public static final By DESTINATION_INPUT = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[3]/div/form/div/div[2]/div/div/div/input");
  public static final By DESTINATION_INPUT_SELECTED = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[3]/div/form/div/div[2]/div[2]/div/div/input");
  public static final By DESTINATION_INPUT_BY_ID = By.xpath("//input[@id='avia_form_destination-input']");
  public static final By AIRPORT_INPUT = By.xpath("//div[2]/div/div/input");
  public static final By DEPARTURE_DATE_BUTTON_WRAPPER = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div/button");
  public static final By DEPARTURE_DATE_BUTTON = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div/button/div/div");
  public static final By DEPARTURE_DATE = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr[4]/td/div/button/div[2]");
  public static final By RETURN_DATE_PANEL_NEXT_BUTTON = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div[2]/div/div/div/div/div/div[2]/div/button[2]");
  public static final By RETURN_DATE_BUTTON = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div/button[2]");
  public static final By RETURN_DATE = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div/div[3]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr[5]/td/div/button/div[2]");
  public static final By SEARCH_BUTTON = By.xpath("//div[@id='selene']/div/div/div[2]/div[2]/div[2]/div/form/div[2]/button");
  public static final By IMPRESSIONS_TAB = By.cssSelector(".s__sii_wON9tIwVoeok:nth-child(3) path:nth-child(1)");
}
