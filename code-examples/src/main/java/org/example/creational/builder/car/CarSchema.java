package org.example.creational.builder.car;

public class CarSchema {

    private Integer seats;
    private String engine;
    private String transmission;
    private String tyres;

    public CarSchema(Integer seats, String engine, String transmission, String tyres) {
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tyres = tyres;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }
}
