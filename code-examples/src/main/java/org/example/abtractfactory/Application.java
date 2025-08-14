package org.example.abtractfactory;

import org.example.abtractfactory.factory.UIElementsFactory;
import org.example.abtractfactory.ui.Button;
import org.example.abtractfactory.ui.Dropdown;

public class Application {

    private final UIElementsFactory uiElementsFactory;

    public Application(UIElementsFactory uiElementsFactory) {
        this.uiElementsFactory = uiElementsFactory;
    }

    public void startApplication() {
        Button button = uiElementsFactory.createButton();
        Dropdown dropdown = uiElementsFactory.createDropdown();

        button.onClick();
        dropdown.showOptions();
    }
}
