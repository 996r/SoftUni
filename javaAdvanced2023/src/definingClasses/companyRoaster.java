package definingClasses;

import java.util.*;

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
store.add(employee);
            } else if (cmd.length == 5) {
                String tmp = cmd[3];
                if(Character.isDigit(cmd[3].charAt(0))){
                    Employee employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),cmd[2],cmd[3],"n/a",
                            Integer.parseInt(cmd[4]));
                    store.add(employee);
                } else {
                    Employee employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),cmd[2],cmd[3],cmd[4],
                            -1);
                    store.add(employee);
                }
            } else {
                Employee employee = new Employee(cmd[0],Double.parseDouble(cmd[1]),cmd[2],cmd[3],cmd[4],Integer.parseInt(cmd[5]));
                store.add(employee);
            }
        }
        Map<String,Double> averageSalary = new HashMap<>();
        for (int i = 0; i < store.size() ; i++) {
            if(!averageSalary.containsKey(store.get(i).getDepartment())) {
                averageSalary.put(store.get(i).getDepartment(), store.get(i).getSalary());
            } else {
            //    Double tempSalary = averageSalary.
                Double tempSalary = store.get(i).getSalary();
             //  averageSalary.put(store.get(i).getName(),)
            }
        }
    }
}
