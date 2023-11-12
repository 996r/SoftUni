package javaOOP2023.restaurant;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    Product(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }

}
