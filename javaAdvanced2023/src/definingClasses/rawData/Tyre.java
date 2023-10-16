package definingClasses.rawData;

public class Tyre {
    private String model;
    private double tyre1Pressure;
    private double tyre1Age;
    private double tyre2Pressure;
    private double tyre2Age;
    private double tyre3Pressure;
    private double tyre3Age;
    private double tyre4Pressure;
    private double tyre4Age;

    public Tyre (String model,double tyre1Pressure, double tyre1Age,
                 double tyre2Pressure, double tyre2Age,
                 double tyre3Pressure, double tyre3Age,
                 double tyre4Pressure, double tyre4Age) {
        this.model = model;
        this.tyre1Pressure = tyre1Pressure;
        this.tyre1Age = tyre1Age;
        this.tyre2Pressure = tyre2Pressure;
        this.tyre2Age = tyre2Age;
        this.tyre3Pressure = tyre3Pressure;
        this.tyre3Age = tyre3Age;
        this.tyre4Pressure = tyre4Pressure;
        this.tyre4Age = tyre4Age;
    }
    public double getTyre1Pressure(){
        return tyre1Pressure;
    }
    public double getTyre1Age(){
        return tyre1Age;
    }
    public double getTyre2Pressure(){
        return tyre2Pressure;
    }
    public double getTyre2Age(){
        return tyre2Age;
    }
    public double getTyre3Pressure(){
        return tyre3Pressure;
    }
    public double getTyre3Age(){
        return tyre3Age;
    }
    public double getTyre4Pressure(){
        return tyre4Pressure;
    }
    public double getTyre4Age(){
        return tyre4Age;
    }
}
