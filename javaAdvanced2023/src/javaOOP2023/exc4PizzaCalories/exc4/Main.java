

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String [] pizzaData = keyboard.nextLine().split("\\s+");
        Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
     String[] doughData = keyboard.nextLine().split("\\s+");
     Dough dough = new Dough(doughData[1],doughData[2], Double.parseDouble(doughData[3]));
     pizza.setDough(dough);
     String toppingData = keyboard.nextLine();

     while(!toppingData.equals("END")) {
         String [] tokens = toppingData.split("\\s+");
         Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
pizza.addTopping(topping);

         toppingData = keyboard.nextLine();
     }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
