package javaOOP2023.needForSpeed;

public class RaceMotorcycle extends Motorcycle {
    private  static final double DEFAULT_FUEL_CONSUMPTION = 8.00;
    RaceMotorcycle(double fuel, int horsepower){
        super(fuel,horsepower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
