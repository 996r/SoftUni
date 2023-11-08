package javaOOP2023.exc2AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        int age = Integer.parseInt(keyboard.nextLine());
        try{
            Chicken chicken = new Chicken(name,age);
            System.out.println(chicken.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
