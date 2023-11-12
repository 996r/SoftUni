package javaOOP2023.Animals;

public class Frog extends Animal{
    Frog(String name, int age, String gender){
        super(name, age, gender);
    }
    @Override
    public String produceSound(){
        return "Ribbit";
    }
}
