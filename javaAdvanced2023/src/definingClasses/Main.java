package definingClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner keyabord = new Scanner(System.in);
            int n = Integer.parseInt(keyabord.nextLine());
            List<Person> store = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                String input = keyabord.nextLine();
                Person person = new Person(input.split(" ")[0],
                        Integer.parseInt(input.split(" ")[1]));
                store.add(person);

            }
            store.stream().
                    filter(person -> person.age > 30).
                    sorted(Comparator.comparing(Person::getName))
                    .forEach(System.out::println);
    }
}
