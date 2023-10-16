package definingClasses.carSalesman;

public class Car {
    private String model;
    private String engine;
    private String weight;
    private String color;

    public Car(String model, String engine){
        this(model,engine,"n/a","n/a");
    }
    public Car(String model, String engine, String weight){
        this(model,engine,weight,"n/a");
    }

    public Car(String model,String engine,String weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color =  color;
    }
    public String getModel(){
        return model;
    }
    public String getEngine(){
        return engine;
    }
    public String getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
}


