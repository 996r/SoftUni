package definingClasses.speedRacing;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            int n = Integer.parseInt(keyboard.nextLine());
            List<Car> store = new ArrayList<>();
        for (int i = 0; i < n ; i++)  {
            String input = keyboard.nextLine();
            String cmd [] = input.split("\\s+");
        Car car = new Car(cmd[0], Double.parseDouble(cmd[1]),
               Double.parseDouble(cmd[2]), 0 );
        store.add(car);
        }
        String input = keyboard.nextLine();
        while(!input.equals("End")) {
           String [] cmd = input.split("\\s+");
            for (int i = 0; i < store.size() ; i++) {
                if(store.get(i).getModel().equals(cmd[1])) {
                    if(store.get(i).getFuelCostPerKm() * Double.parseDouble(cmd[2]) <=
                    store.get(i).getFuelAmount() ) {
                        store.get(i).setDistanceTraveled(Double.parseDouble(cmd[2]) + store.get(i).getDistanceTraveled());
                       double tempFuelAmount = store.get(i).getFuelAmount() - (Double.parseDouble(cmd[2])
                               * store.get(i).getFuelCostPerKm());
                       store.get(i).setFuelAmount(tempFuelAmount);
                       break;
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
            input = keyboard.nextLine();
        }
        store.stream().forEach((e-> System.out.printf("%s %.2f %.0f%n",e.getModel(),e.getFuelAmount(),e.getDistanceTraveled())));

    }
}
