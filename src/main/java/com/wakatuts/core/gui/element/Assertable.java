package com.wakatuts.core.gui.element;

import com.wakatuts.core.gui.selenium.WaitStrategy;

public interface Assertable {


    void shouldHaveState(WaitStrategy strategy);
    void textEquals(String text);
    void textContains(String text);
    void valueEquals(String text);
    void valueContains(String text);
    void attributeEquals(String attribute, String text);
    void attributeContains(String attribute, String text);

}
