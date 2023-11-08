package javaOOP2023.WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    Double animalWeight;
    Integer foodEaten;
    protected Animal(String animalName,String animalType,
                     double animalWeight){
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }
    public abstract void makeSound();

    public void eat(Food food){
        foodEaten += food.getQuantity();

    }
}
