package org.example.builder.car.builder;

import org.example.builder.car.CarSchema;

public interface Builder {

    void reset();
    Builder setSeats(int number);
    Builder setEngine(String engine);
    Builder setTyres(String tyres);
    Builder setTransmission(String transmission);
    CarSchema build();
}
