package org.example.builder.car.builder;

import org.example.builder.car.Car;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car(null, null, null, null);
    }

    @Override
    public Builder setSeats(int number) {
        car.setSeats(number);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTyres(String tyres) {
        car.setTyres(tyres);
        return this;
    }

    @Override
    public Builder setTransmission(String transmission) {
        car.setTransmission(transmission);
        return this;
    }

    public Car build() {
        return car;
    }
}
