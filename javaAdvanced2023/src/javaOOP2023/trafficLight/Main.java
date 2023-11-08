package javaOOP2023.trafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
      Color [] colors = Arrays.stream(keyboard.nextLine()
              .split("\\s+")).map(Color::valueOf)
              .toArray(Color[]:: new);
        int n = Integer.parseInt(keyboard.nextLine());
        List<TrafficLight> trafficLightList = new ArrayList<>();
        for(Color color : colors) {
        TrafficLight trafficLight = new TrafficLight(color);
        trafficLightList.add(trafficLight);
        }
        for (int i = 0; i < n ; i++) {
            for(TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }



    }
}
