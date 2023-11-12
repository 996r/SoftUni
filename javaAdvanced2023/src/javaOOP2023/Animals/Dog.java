package javaOOP2023.Animals;

public class Dog extends Animal{
    Dog(String name, int age, String gender){
        super(name, age, gender);
    }
    @Override
public String produceSound(){
        return "Woof!";
    }

}
