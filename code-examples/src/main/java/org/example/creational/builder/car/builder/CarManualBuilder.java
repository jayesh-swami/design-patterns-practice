package org.example.creational.builder.car.builder;

import org.example.creational.builder.car.CarManual;

public class CarManualBuilder implements Builder {

    private CarManual carManual;

    CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.carManual = new CarManual(null, null, null, null);
    }

    @Override
    public Builder setSeats(int number) {
        carManual.setSeats(number);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        carManual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTyres(String tyres) {
        carManual.setTyres(tyres);
        return this;
    }

    @Override
    public Builder setTransmission(String transmission) {
        carManual.setTransmission(transmission);
        return this;
    }

    public CarManual build() {
        return this.carManual;
    }
}
