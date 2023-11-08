package javaOOP2023.exc3ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private Double money;
    private List<Product> productList;
    Person(String name, double money){
setMoney(money);
setName(name);
this.productList = new ArrayList<>();
    }
    private void setName(String name){
        Validator.validateString(name);
        this.name = name;
    }
    private void setMoney(double money){
        Validator.validateNumber(money);
        this.money = money;
    }
    public void buyProduct(Product product){
        money -= product.getCost();
  this.productList.add(product);
    }
    public String getName(){
        return name;
    }
    public double getMoney() {
        return money;
    }
    @Override
    public String toString() {
        return String.format("%s - %s",
                name,
                productList.stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", "))
        );
    }
}
