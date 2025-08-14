package org.example.factory.factory;

import org.example.factory.button.Button;
import org.example.factory.button.LinuxButton;

public class LinuxButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
