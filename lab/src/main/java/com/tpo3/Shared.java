package com.tpo3;

import java.util.HashMap;
import java.util.Map;

public class Shared {
    public static final String MainPageURL = "https://www.aviasales.ru/";
    public static final String SettingsPageURL = "https://www.aviasales.ru/my/settings";
    public static final String NotificationPageURL = "https://www.aviasales.ru/my/notifications";
    public static final String EmptyFav = "Пока нет сохранённых билетов, зато вы уже добавили классные места";
    public static void pause(int timeout) {
        try {
          Thread.sleep(timeout);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
    }

    public static Map<String, String> mockPerson = new HashMap<>();
}
