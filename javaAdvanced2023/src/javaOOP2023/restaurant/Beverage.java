package javaOOP2023.restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double mililiters;
   public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.mililiters = milliliters;
    }
      public double getMilliliters(){
        return mililiters;
    }
}
