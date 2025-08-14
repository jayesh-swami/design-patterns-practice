package org.example.abtractfactory.factory;

import org.example.abtractfactory.ui.Button;
import org.example.abtractfactory.ui.Dropdown;

public abstract class UIElementsFactory {

    public abstract Button createButton();

    public abstract Dropdown createDropdown();
}
