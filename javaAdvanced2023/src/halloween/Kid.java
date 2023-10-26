package  halloween;

import javax.swing.*;

public class Kid {
    private String name;
    private int age;
    private String street;

    Kid(String name, int age, String street) {
         this.name = name;
         this.age = age;
         this.street = street;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStreet() {
        return street;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setAge(int tempAge) {
        this.age = tempAge;
    }
    public void setStreet(String street){

    }


    @Override
    public String toString() {
        return String.format("%s, %d years old, from %s", this.getName(), this.age,
                this.getStreet());
    }
}
