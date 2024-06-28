package com.wakatuts.core.gui.element;

import com.wakatuts.core.gui.selenium.WaitStrategy;

public interface Waitable {

    void toBe(WaitStrategy strategy);

}
