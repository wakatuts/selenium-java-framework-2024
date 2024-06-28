package com.wakatuts.core.gui.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CustomExpectedConditions {

    public static ExpectedCondition<Boolean> presenceOfElementNotLocated(By by) {
        return new ExpectedCondition<>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    driver.findElement(by);
                    return false;
                } catch (NoSuchElementException e) {
                    return true;
                }
            }

            @Override
            public String toString() {
                return "presence of element not located by: " + by;
            }

        };
    }

}
