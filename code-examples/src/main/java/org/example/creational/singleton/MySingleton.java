package org.example.creational.singleton;

public class MySingleton {

    private volatile MySingleton instance;

    private MySingleton() { }

    public MySingleton getInstance() {

        if(instance == null) {
            synchronized (MySingleton.class) {
                if(instance == null) {
                    this.instance = new MySingleton();
                }
            }
        }

        return this.instance;
    }
}
