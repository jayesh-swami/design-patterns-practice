package org.example.creational.factory.factory;

import org.example.creational.factory.button.Button;
import org.example.creational.factory.button.LinuxButton;

public class LinuxButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
