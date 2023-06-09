package com.carDealership;

public abstract class Vehicle {

    private String make;
    private String model;
    private String numberPlate;

    public Vehicle(String make, String model, String numberPlate) {
        this.make = make;
        this.model = model;
        this.numberPlate = numberPlate;
    }

    public void speed() {
        System.out.println("Acelerando...");
    }

    public void stop() {
        System.out.println("Frenando...");
    }

    private void checkEngine() {
        System.out.println("Chequeando motor...");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String newModel) {
        if (newModel != null) {
            this.make = newModel;
        }
    }

    public void start() {
        checkEngine();
        System.out.println("Encendiendo...");
    }


    @Override
    public String toString() {
        return "\nVehiculo:" +
                "\n\tmake=" + make +
                "\n\tmodel=" + model +
                "\n\tnumberPlate=" + numberPlate;

    }


}
