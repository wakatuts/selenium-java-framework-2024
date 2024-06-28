package com.wakatuts.core.gui.selenium;

import com.wakatuts.constants.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandler {

    public static WebDriver getDriver(String webBrowser) {
        WebDriver driver = null;

        try {
            Browser browser = Browser.valueOf(webBrowser);
            switch (browser) {
                case CHROME -> driver = new ChromeDriver();
                case EDGE -> driver = new EdgeDriver();
                case FIREFOX -> driver = new FirefoxDriver();
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unsupported browser: " + webBrowser);
        }

        return driver;
    }

}
