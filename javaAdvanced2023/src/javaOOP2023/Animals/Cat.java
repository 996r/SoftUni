package javaOOP2023.Animals;

import javaOOP2023.needForSpeed.Car;

public class Cat extends Animal{
    Cat(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
      return "Meow meow";
    }
}
