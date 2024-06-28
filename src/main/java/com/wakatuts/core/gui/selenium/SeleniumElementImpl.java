package com.wakatuts.core.gui.selenium;

import com.wakatuts.core.gui.element.Actionable;
import com.wakatuts.core.gui.element.Assertable;
import com.wakatuts.core.gui.element.Waitable;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumElementImpl implements Actionable, Assertable, Waitable {

    private final WebDriver driver;
    private final By by;

    public SeleniumElementImpl(WebDriver driver, By by) {
        this.driver = driver;
        this.by = by;
    }

    private WebDriverWait explicitWait(int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

    private WebElement waitForElement(WaitStrategy strategy, int timeout) {
        ExpectedCondition<WebElement> condition;
        switch (strategy) {
            case VISIBLE -> condition = ExpectedConditions.visibilityOfElementLocated(by);
            case CLICKABLE -> condition = ExpectedConditions.elementToBeClickable(by);
            default -> condition = ExpectedConditions.presenceOfElementLocated(by);
        }
        return explicitWait(timeout).until(condition);
    }

    private Boolean waitForCondition(WaitStrategy strategy, int timeout) {
        ExpectedCondition<Boolean> condition;
        switch (strategy) {
            case NOT_VISIBLE -> condition = ExpectedConditions.invisibilityOfElementLocated(by);
            case NOT_PRESENT -> condition = CustomExpectedConditions.presenceOfElementNotLocated(by);
            default -> throw new IllegalArgumentException("invalid strategy");
        }
        return explicitWait(timeout).until(condition);
    }


    private WebElement getElement(WaitStrategy strategy, int timeout) {
        try {
            return waitForElement(strategy, timeout);
        } catch (TimeoutException e) {
            return null;
        }
    }

    private WebElement getElement(WaitStrategy strategy) {
        return getElement(strategy, 30);
    }

    private Boolean isElement(WaitStrategy strategy, int timeout) {
        try {
            return waitForCondition(strategy, timeout);
        } catch (TimeoutException e) {
            return false;
        }
    }

    private Boolean isElement(WaitStrategy strategy) {
        return isElement(strategy, 30);
    }


    @Override
    public By getBy() {
        return null;
    }

    @Override
    public String getText() {
        return "";
    }

    @Override
    public Boolean hasState(WaitStrategy strategy) {
        return null;
    }

    @Override
    public void click() {

    }

    @Override
    public String getAttribute(String attributeName) {
        return "";
    }

    @Override
    public Actionable withState(WaitStrategy strategy) {
        return null;
    }

    @Override
    public Assertable andAssertThat() {
        return null;
    }

    @Override
    public Waitable andWaitElement() {
        return null;
    }

    @Override
    public void shouldHaveState(WaitStrategy strategy) {

    }

    @Override
    public void textEquals(String text) {

    }

    @Override
    public void textContains(String text) {

    }

    @Override
    public void valueEquals(String text) {

    }

    @Override
    public void valueContains(String text) {

    }

    @Override
    public void attributeEquals(String attribute, String text) {

    }

    @Override
    public void attributeContains(String attribute, String text) {

    }

    @Override
    public void toBe(WaitStrategy strategy) {

    }
}
