package org.example.factory.factory;

import org.example.factory.button.Button;
import org.example.factory.button.HtmlButton;

public class HtmlButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}