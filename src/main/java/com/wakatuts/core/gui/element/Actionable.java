package com.wakatuts.core.gui.element;

import com.wakatuts.core.gui.selenium.WaitStrategy;
import org.openqa.selenium.By;

public interface Actionable {


    By getBy();
    String getText();
    Boolean hasState(WaitStrategy strategy);
    void click();
    String getAttribute(String attributeName);
    Actionable withState(WaitStrategy strategy);
    Assertable andAssertThat();
    Waitable andWaitElement();

}
