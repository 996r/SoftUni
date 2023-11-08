package javaOOP2023.WildFarm;

public class Cat extends Felime {
    public Cat(String animalName, String animalType,
               Double animalWeight, String livingRegion){
        super(animalName,animalType,animalWeight,livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
}
