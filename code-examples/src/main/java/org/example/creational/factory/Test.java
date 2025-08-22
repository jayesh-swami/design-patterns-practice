package org.example.creational.factory;

import org.example.creational.factory.button.Button;
import org.example.creational.factory.factory.HtmlButtonFactory;
import org.example.creational.factory.factory.LinuxButtonFactory;

public class Test {

    public static void main() {

        LinuxButtonFactory linuxButtonFactory = new LinuxButtonFactory();
        HtmlButtonFactory htmlButtonFactory = new HtmlButtonFactory();

        // now based on the os we can just create the different buttons here
        Button linuxButton = linuxButtonFactory.createButton();
        Button htmlButton = htmlButtonFactory.createButton();

        // and our application now can use the Button interface without caring about the type of button
        linuxButton.onClick();
        htmlButton.onClick();
    }
}
