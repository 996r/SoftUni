package javaOOP2023.trafficLight;

public class TrafficLight {
    private Color color;

    public TrafficLight (Color color){
        //constructor
        this.color = color;
    }
    public void changeColor() {
        switch (this.color){
            case RED :
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
        }
    }
    public String getColor() {
        return this.color.name();
    }

}
