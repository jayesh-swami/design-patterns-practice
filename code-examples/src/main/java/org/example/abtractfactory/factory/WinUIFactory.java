package org.example.abtractfactory.factory;

import org.example.abtractfactory.ui.Button;
import org.example.abtractfactory.ui.Dropdown;
import org.example.abtractfactory.ui.WinButton;
import org.example.abtractfactory.ui.WinDropdown;

public class WinUIFactory extends UIElementsFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new WinDropdown();
    }
}
