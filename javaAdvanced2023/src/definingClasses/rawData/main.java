package definingClasses.rawData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
         List<Car> storeCar = new ArrayList<>();
        List<Cargo> storeCargo = new ArrayList<>();
        List<Tyre> storeTyre = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] cmd = keyboard.nextLine().split("\\s+");
Car car = new Car(cmd[0],Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
storeCar.add(car);
Cargo cargo = new Cargo(cmd[0],Integer.parseInt(cmd[3]),cmd[4]);
storeCargo.add(cargo);
Tyre tyre = new Tyre(cmd[0],Double.parseDouble(cmd[5]),Double.parseDouble(cmd[6]),
        Double.parseDouble(cmd[7]),Double.parseDouble(cmd[8]),
        Double.parseDouble(cmd[9]),Double.parseDouble(cmd[10]),
        Double.parseDouble(cmd[11]),Double.parseDouble(cmd[12]));
storeTyre.add(tyre);
        }
        String input = keyboard.nextLine();
        if(input.equals("fragile")){
            for (int i = 0; i < storeCar.size() ; i++) {
                if(storeCargo.get(i).getCargoType().equals(input)){
                   // for (int j = 0; j < storeTyre.size() ; j++) {
                        if((storeTyre.get(i).getTyre1Pressure() +
                        storeTyre.get(i).getTyre2Pressure() +
                        storeTyre.get(i).getTyre3Pressure()+
                        storeTyre.get(i).getTyre4Pressure()) / 4 < 1){
                            System.out.println(storeCar.get(i).getModel());
                   //     }
                    }
                }
            }

        } else if(input.equals("flamable")) {
            for (int i = 0; i < storeCar.size() ; i++) {
                if(storeCargo.get(i).getCargoType().equals("flamable")){
                    if(storeCar.get(i).getEnginePower() > 250){
                        System.out.println(storeCar.get(i).getModel());
                    }
                }
            }
        }
    }
}
