package javaOOP2023.Animals;


import java.util.LinkedHashMap;
import java.util.Map;

public class Animal {

    private String name;
    private int age;
    private String gender;
    private Map<String, Animal> animalStore = new LinkedHashMap<>();

    Animal(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }
    public void setName(String name){
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException(("Invalid input!"));
        }
        this.name = name;
    }
    public void setAge(int age){
        if (age < 0) {
            throw new IllegalArgumentException(("Invalid input!"));
        }
        this.age = age;
    }
    public void setGender(String gender){
        if(gender.isBlank() || gender.isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public String produceSound() {
        return null;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
              name + " " + age + " " + gender + "\n" +
                produceSound();
    }
}
