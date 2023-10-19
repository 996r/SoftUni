package definingClasses.google;

public class Car extends Person {

    private String carModel;
        private int carSpeed;
        public Car (String carModel, int carSpeed ,String name){
            super(name);
            this.carModel = carModel;
            this.carSpeed = carSpeed;
        }
}
