package definingClasses.google;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        String[] cmd = input.split("\\s+");
LinkedHashMap<String,Person> storePerson = new LinkedHashMap<>();
        while (!cmd[0].equals("End")) {
            Person person;
            if(!storePerson.containsKey(cmd[0])) {
             person = new Person(cmd[0]);

            } else {
                 person = storePerson.get(cmd[0]);
            }
            switch (cmd[1]) {
                case "company":
                    Company company = new Company(cmd[2],cmd[3],Double.parseDouble(cmd[4]),cmd[0]);
                    person.addCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(cmd[1],cmd[2],cmd[0]);
                    person.addPokemon(pokemon);
                    break;
                case"parents":
                    Parents parents = new Parents(cmd[1],cmd[2],cmd[0]);
                    person.addParents(parents);
                    break;
                case "children":
                    Children children = new Children(cmd[1],cmd[2],cmd[0]);
                    person.addChildren(children);
                    break;
                case "car":
                    Car car = new Car(cmd[2],Integer.parseInt(cmd[3]),cmd[0]);
                    break;
            }
            if(!storePerson.containsKey(cmd[0])) {
                storePerson.put(cmd[0],person);
            }


input = keyboard.nextLine();
            cmd = input.split("\\s+");
        }
        System.out.println("");

    }
}
