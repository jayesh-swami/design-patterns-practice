package org.example.abtractfactory.ui;

public class LinuxButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Linux Superpowered Button");
    }
}
