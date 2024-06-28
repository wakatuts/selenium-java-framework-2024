package com.wakatuts.core.gui.driver;

import com.wakatuts.core.gui.element.Actionable;
import com.wakatuts.core.gui.element.Waitable;
import org.openqa.selenium.By;

public class DriverDecorator extends Driver {

    private final Driver driver;

    public DriverDecorator(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public void goToUrl(String url) {
        driver.goToUrl(url);
    }

    @Override
    public void deleteAllCookies() {
        driver.deleteAllCookies();
    }

    @Override
    public Actionable locate(By by) {
        return null;
    }

    @Override
    public Waitable waitElement(By by) {
        return null;
    }
}
