package org.example.creational.abtractfactory.factory;

import org.example.creational.abtractfactory.ui.Button;
import org.example.creational.abtractfactory.ui.Dropdown;

public abstract class UIElementsFactory {

    public abstract Button createButton();

    public abstract Dropdown createDropdown();
}
