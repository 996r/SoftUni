package javaOOP2023.cardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardRank cardRank;

    public Card(CardSuit cardSuits, CardRank cardRanks) {
        this.cardSuit = cardSuits;
        this.cardRank = cardRanks;
    }
    public int calculatePower() {
         return this.cardSuit.getValue() +
    this.cardRank.getValue();
    };
}
