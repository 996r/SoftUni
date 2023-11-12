package javaOOP2023.needForSpeed;

public class Car extends Vehicle{
    private  static final double DEFAULT_FUEL_CONSUMPTION = 3.00;
    Car(double fuel, int horsepower) {
        super(fuel,horsepower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
