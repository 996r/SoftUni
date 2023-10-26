package halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data = new ArrayList<>();

    House(int capacity){
        this.capacity = capacity;
    }

    public void addKid(Kid kid) {
        if(data.size() <= capacity) {
            data.add(kid);
        }

    }
    public boolean removeKid (String name) {
        boolean flag = false;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                flag = true;
            }
        }
        return flag;
    }
    public Kid getKid (String street) {
        Kid kid = null;
        for (int i = 0; i < data.size() ; i++) {
            if(data.get(i).getStreet().equals(street)) {
               return kid = data.get(i);
            }
        }
return null;
    }
    public int getAllKids(){
        return data.size();
    }
    public String getStatistics() {
        String temp = "Children who visited a house for candy:\n";
        for (int i = 0; i < data.size() ; i++) {
            temp+= data.get(i).toString() + "\n";
            System.out.println();
        }
        return temp;
    }
}
