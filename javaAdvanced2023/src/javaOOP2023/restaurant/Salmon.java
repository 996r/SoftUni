package javaOOP2023.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    private final static double SALMON_GRAMS = 22;
    Salmon(String name, BigDecimal price){
        super(name, price, SALMON_GRAMS);
    }
}
