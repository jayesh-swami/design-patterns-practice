package org.example.builder.car.builder;

import org.example.builder.car.CarSchema;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public CarSchema buildSUV() {
        builder.setEngine("Mid sized engine");
        builder.setTransmission("Okayish automatic");
        builder.setTyres("4");
        builder.setSeats(7);

        return builder.build();
    }

    public CarSchema buildSports() {
        builder.setEngine("6.4L Semicharged V12 engine");
        builder.setTransmission("Manual");
        builder.setTyres("4");
        builder.setSeats(2);

        return builder.build();
    }
}
