package javaOOP2023.exc1Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double length = Double.parseDouble(keyboard.nextLine());
        double width = Double.parseDouble(keyboard.nextLine());
        double height = Double.parseDouble(keyboard.nextLine());
        try {
            Box box = new Box(length, width, height);
            System.out.println(box.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }
}
