package definingClasses.rawData;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;

    public Car(String model,int engineSpeed ,int enginePower){
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }
public String getModel(){
        return model;
}
public int getEngineSpeed(){
        return engineSpeed;
}
public int getEnginePower(){
        return enginePower;
}

}
