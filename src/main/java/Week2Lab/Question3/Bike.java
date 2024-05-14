package Week2Lab.Question3;

public class Bike extends Vehicle{

        // Constructor
        public Bike(String make, String model, int year) {
            super(make, model, year);
        }

        @Override
        public void accelerate() {
            System.out.println("Bike is accelerating by twisting the throttle.");
        }
}
