package definingClasses.carSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Engine> storeEngine = new ArrayList<>();
        List<Car> storeCar = new ArrayList<>();
        int nEngines = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < nEngines ; i++) {
            String[] cmd = keyboard.nextLine().split("\\s+");
            if (cmd.length == 4) {
                Engine engine = new Engine(cmd[0], cmd[1],
                        cmd[2], cmd[3]);
                storeEngine.add(engine);
            } else if(cmd.length == 2) {
                Engine engine = new Engine(cmd[0],cmd[1]);
                storeEngine.add(engine);
            } else if (cmd.length == 3){
                if(cmd[2].matches("\\d+")){
                    Engine engine = new Engine(cmd[0],cmd[1],cmd[2]);
                    storeEngine.add(engine);
                } else {
                    Engine engine = new Engine(cmd[0],cmd[1],"n/a",cmd[2]);
                    storeEngine.add(engine);
                }
            }
        }
        int nCar = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < nCar ; i++) {
            String cmd[] = keyboard.nextLine().split("\\s+");
            if(cmd.length == 4) {
                Car car = new Car(cmd[0], cmd[1], cmd[2], cmd[3]);
                storeCar.add(car);
            } else if(cmd.length == 2) {
                Car car = new Car(cmd[0],cmd[1]);
                storeCar.add(car);
            } else if(cmd.length == 3) {
                if(cmd[2].matches("\\d+")) {
                    Car car = new Car(cmd[0],cmd[1],cmd[2],"n/a");
                    storeCar.add(car);
                } else {
                    Car car = new Car(cmd[0],cmd[1],"n/a",cmd[2]);
                    storeCar.add(car);
                }
            }
        }
        for (int i = 0; i < storeCar.size() ; i++) {
            System.out.printf("%s:%n" +
                    "%s:%n",storeCar.get(i).getModel(),storeCar.get(i).getEngine());
            for (int j = 0; j < storeEngine.size() ; j++) {
                if(storeEngine.get(j).getModel().equals(storeCar.get(i).getEngine())){
                    System.out.printf("Power: %s%n" +
                            "Displacement: %s%n" +
                            "Efficiency: %s%n",storeEngine.get(j).getPower(),
                            storeEngine.get(j).getDisplacement(),
                            storeEngine.get(j).getEfficiency());
                }
            }
            System.out.printf("Weight: %s%n" +
                    "Color: %s%n",storeCar.get(i).getWeight(),
                    storeCar.get(i).getColor());

        }
    }
}
