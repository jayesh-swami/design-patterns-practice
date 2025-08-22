package org.example.creational.abtractfactory.factory;

import org.example.creational.abtractfactory.ui.Button;
import org.example.creational.abtractfactory.ui.Dropdown;
import org.example.creational.abtractfactory.ui.WinButton;
import org.example.creational.abtractfactory.ui.WinDropdown;

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
