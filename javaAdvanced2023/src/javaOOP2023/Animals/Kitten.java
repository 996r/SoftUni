package javaOOP2023.Animals;

public class Kitten extends Cat{
    private static final String GENDER = "Female";
    Kitten(String name, int age){
        super(name, age, GENDER);
    }
    @Override
    public String produceSound(){
        return "Meow";
    }
}
