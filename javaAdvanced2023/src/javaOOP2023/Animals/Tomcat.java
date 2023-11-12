package javaOOP2023.Animals;

public class Tomcat extends Cat{
    private static final String GENDER = "Male";
    Tomcat(String name, int age){
        super(name, age, GENDER);
    }
    @Override
    public String produceSound(){
        return "MEOW";
    }
}
