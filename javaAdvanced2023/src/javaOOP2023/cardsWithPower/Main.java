package javaOOP2023.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String rank = keyboard.nextLine();
        String power = keyboard.nextLine();

        Card card = new Card(CardSuit.valueOf(power),
                CardRank.valueOf(rank));


        System.out.printf("Card name: %s of %s; Card power: %d",
                rank,power,card.calculatePower());
    }


}
