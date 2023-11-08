package javaOOP2023.exc3ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String people[] = keyboard.nextLine().split(";");
        String products[] = keyboard.nextLine().split(";");
        LinkedHashMap<String, Person> storePerson = new LinkedHashMap<>();
        LinkedHashMap<String, Product> storeProduct = new LinkedHashMap<>();
        for (int i = 0; i < people.length ; i++) {
            Person person = new Person(people[i].split("=")[0],
                    Double.parseDouble(people[i].split("=")[1]));
            storePerson.put(people[i].split("=")[0], person);
            Product product = new Product(products[i].split("=")[0],
                    Double.parseDouble(products[i].split("=")[1]));
            storeProduct.put(products[i].split("=")[0], product);
        }
        String input =  keyboard.nextLine();
        while(!input.equals("END")) {
            Person person = storePerson.get(input.split("\\s+")[0]);
            Product product = storeProduct.get(input.split("\\s+")[1]);
            if (person != null && product != null) {
                if (person.getMoney() < product.getCost()) {
                    System.out.printf("%s can't afford %s%n", person.getName(), product.getName());
                } else {
                    System.out.printf("%s bought %s%n", person.getName(), product.getName());
                    person.buyProduct(product);
                }
                input = keyboard.nextLine();
            }
        }  //

        for (Map.Entry<String, Person> entry: storePerson.entrySet()) {
            System.out.println(entry.getValue());
        }

//        System.out.println(storePerson.values().stream()
//                .map(Person::toString)
//                .collect(Collectors.joining(System.lineSeparator())));


    }
}
