package com.wakatuts.core.gui.driver;

import com.wakatuts.core.gui.element.Actionable;
import com.wakatuts.core.gui.element.Waitable;
import org.openqa.selenium.By;

public abstract class Driver {

    public abstract void quit();
    public abstract void goToUrl(String url);
    public abstract void deleteAllCookies();
    public abstract Actionable locate(By by);
    public abstract Waitable waitElement(By by);

}
