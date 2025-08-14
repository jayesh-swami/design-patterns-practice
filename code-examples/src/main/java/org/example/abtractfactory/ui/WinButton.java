package org.example.abtractfactory.ui;

public class WinButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Windows Button");
    }
}
