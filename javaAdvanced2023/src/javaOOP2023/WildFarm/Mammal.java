package javaOOP2023.WildFarm;


public abstract class Mammal  extends  Animal {
    private  String livingRegion;

    protected Mammal(String animalName, String animalType,
                     Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
this.livingRegion = livingRegion;
    }
}
