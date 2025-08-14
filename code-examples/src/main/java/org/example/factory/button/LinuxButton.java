package org.example.factory.button;

public class LinuxButton implements Button {
    @Override
    public void onClick() {
        System.out.println("SuperLinux button!");
    }
}
