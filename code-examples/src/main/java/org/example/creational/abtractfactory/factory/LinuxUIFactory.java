package org.example.creational.abtractfactory.factory;

import org.example.creational.abtractfactory.ui.Button;
import org.example.creational.abtractfactory.ui.Dropdown;
import org.example.creational.abtractfactory.ui.LinuxButton;
import org.example.creational.abtractfactory.ui.LinuxDropdown;

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
