package org.example.creational.factory.factory;

import org.example.creational.factory.button.Button;
import org.example.creational.factory.button.HtmlButton;

public class HtmlButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}