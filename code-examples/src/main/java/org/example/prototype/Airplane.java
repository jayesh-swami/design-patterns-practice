package org.example.prototype;

public class Airplane implements Prototype {

    private final String engine;
    private final String destination;

    Airplane(String engine, String destination) {
        this.engine = engine;
        this.destination = destination;
    }

     Airplane(Airplane airplane) {
         super();
         this.engine = airplane.engine;
         this.destination = airplane.destination;
    }

    @Override
    public Airplane copy() {
        return new Airplane(this);
    }
}
