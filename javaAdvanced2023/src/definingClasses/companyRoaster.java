package definingClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class companyRoaster {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Employee> store =  new ArrayList<>();
        int n = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < n ; i++) {
            String input = keyboard.nextLine();
            String cmd [] = input.split("\\s+");
            if(cmd.length == 4) {
Employee employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),cmd[2],cmd[3]);
            } else if (cmd.length == 5) {
                String tmp = cmd[3];

            }
            input = keyboard.nextLine();
        }
    }
}
