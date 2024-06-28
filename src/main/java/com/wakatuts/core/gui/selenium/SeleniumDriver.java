package com.wakatuts.core.gui.selenium;

import com.wakatuts.core.gui.driver.Driver;
import com.wakatuts.core.gui.element.Actionable;
import com.wakatuts.core.gui.element.Waitable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDriver extends Driver {

    private final WebDriver driver;

    public SeleniumDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public void goToUrl(String url) {
        driver.navigate().to(url);
    }

    @Override
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }

    @Override
    public Actionable locate(By by) {
        return null;
    }

    @Override
    public Waitable waitElement(By by) {
        return null;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}
