package org.example.creational.abtractfactory;

import org.example.creational.abtractfactory.factory.LinuxUIFactory;
import org.example.creational.abtractfactory.factory.WinUIFactory;

public class Test {

    public static void main(String[] args) {
        Application linuxApp = new Application(new LinuxUIFactory());
        Application winApp = new Application(new WinUIFactory());

        linuxApp.startApplication();
        winApp.startApplication();
    }
}
