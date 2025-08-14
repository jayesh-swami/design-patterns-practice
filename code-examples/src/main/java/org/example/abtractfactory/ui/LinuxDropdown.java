package org.example.abtractfactory.ui;

public class LinuxDropdown implements Dropdown {

    @Override
    public void showOptions() {
        System.out.println("The options of the world");
    }
}
