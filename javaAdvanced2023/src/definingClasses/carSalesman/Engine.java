package definingClasses.carSalesman;

public class Engine {
    private  String model;
    private String power;
    private String displacement;
 private String efficiency;

 public Engine(String model,String power){
     this(model,power,"n/a","n/a");
 }
 public Engine(String model,String power, String displacement){
     this(model, power, displacement, "n/a");
 }

 public Engine(String model, String power, String displacement, String efficiency){
     this.model = model;
     this.power = power;
     this.displacement = displacement;
     this.efficiency = efficiency;
 }
 public String getModel(){
     return model;
 }
 public String getPower(){
     return power;
 }
 public String getDisplacement(){
     return displacement;
 }
 public String getEfficiency(){
     return efficiency;
 }
}
