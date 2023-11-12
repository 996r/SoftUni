package javaOOP2023.person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        int age = Integer.parseInt(keyboard.nextLine());
        Child child = new Child(name, age);
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
