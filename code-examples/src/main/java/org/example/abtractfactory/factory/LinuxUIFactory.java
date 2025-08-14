package org.example.abtractfactory.factory;

import org.example.abtractfactory.ui.Button;
import org.example.abtractfactory.ui.Dropdown;
import org.example.abtractfactory.ui.LinuxButton;
import org.example.abtractfactory.ui.LinuxDropdown;

public class LinuxUIFactory extends UIElementsFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new LinuxDropdown();
    }
}
