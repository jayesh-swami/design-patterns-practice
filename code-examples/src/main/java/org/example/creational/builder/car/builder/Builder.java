package org.example.creational.builder.car.builder;

import org.example.creational.builder.car.CarSchema;

public interface Builder {

    void reset();
    Builder setSeats(int number);
    Builder setEngine(String engine);
    Builder setTyres(String tyres);
    Builder setTransmission(String transmission);
    CarSchema build();
}
