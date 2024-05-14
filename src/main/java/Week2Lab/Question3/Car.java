package Week2Lab.Question3;

public class Car extends Vehicle{

        // Constructor
        public Car(String make, String model, int year) {
            super(make, model, year);
        }

        @Override
        public void accelerate() {
            System.out.println("Car is accelerating by pressing the accelerator pedal.");
        }


}
