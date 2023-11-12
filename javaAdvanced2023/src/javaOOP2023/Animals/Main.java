package javaOOP2023.Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

            String line = keyboard.nextLine();
        while(!line.equals("Beast")){
            try {
                String tokens[] = keyboard.nextLine().split("\\s+");
                switch (line) {
                    case "Dog":
                        Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1])
                                , tokens[2]);
                        System.out.println(dog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1])
                                , tokens[2]);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1])
                                , tokens[2]);
                        System.out.println(frog);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(tomcat);
                        break;
                    case "Kiten":
                        Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(kitten);
                        break;
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            line = keyboard.nextLine();

        }
    }
}
