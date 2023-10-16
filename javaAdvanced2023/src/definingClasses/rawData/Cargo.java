package definingClasses.rawData;

public class Cargo {
    private String model;
    private int cargoWeight;
    private String cargoType;

    public Cargo(String model, int cargoWeight, String cargoType){
        this.model = model;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }
    public String getModel(){
        return model;
    }
    public int getCargoWeight(){
        return cargoWeight;
    }
    public String getCargoType(){
        return cargoType;
    }
}
