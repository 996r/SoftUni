package javaOOP2023.needForSpeed;

public class Vehicle {
    private  static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
   private double fuelConsumption;
   private double fuel;
   private int horsePower;

   public Vehicle(double fuel, int horsePower){
       this.fuel = fuel;
       this.horsePower = horsePower;
       this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
   }


   public void setFuelConsumption(Double fuelConsumption){
       this.fuelConsumption = fuelConsumption;
   }
   public void setFuel(double fuel){
       this.fuel = fuel;
   }
   public void setHorsePower(int horsePower){
       this.horsePower = horsePower;
   }
   public double getFuelConsumption(){
       return fuelConsumption;
   }
   public double getFuel(){
       return fuel;
   }
   public int getHorsePower() {
       return horsePower;
   }

   public void drive(double kilometers){
       double remainingFuel = this.fuel -(kilometers * this.fuelConsumption);
       if(remainingFuel >= 0) {
            this.setFuel(remainingFuel);
       }
   }

}
