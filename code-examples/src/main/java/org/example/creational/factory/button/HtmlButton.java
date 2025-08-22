package org.example.creational.factory.button;

public class HtmlButton implements Button {

    @Override
    public void onClick() {
        System.out.println("HTML Button in flesh");
    }
}
