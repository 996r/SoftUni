package definingClasses.speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private double distanceTraveled;


    public Car(String model, Double fuelAmount, Double fuelCostPerKm){
        this(model, fuelAmount ,fuelCostPerKm, 0);
    }
    public Car(String model, double fuelAmount, double fuelCostPerKm, double distanceTraveled) {
    this.model = model;
    this.fuelAmount = fuelAmount;
    this.fuelCostPerKm = fuelCostPerKm;
    this.distanceTraveled = distanceTraveled;
}
    public String getModel ()
    {
        return model;
    }
    public double getFuelAmount(){
        return fuelAmount;
    }
    public double getFuelCostPerKm(){
        return fuelCostPerKm;
    }
    public double getDistanceTraveled(){
        return  distanceTraveled;
    }
    public void setFuelAmount (Double fuel) {
        this.fuelAmount = fuel;
    }
    public  void setDistanceTraveled(double distance) {
        this.distanceTraveled = distance;
    }



}
