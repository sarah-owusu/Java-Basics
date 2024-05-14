package Week2Lab.Question3;

public abstract class Vehicle {

    // Vehicle.java - Abstract class
        private String make;
        private String model;
        private int year;

        // Constructor
        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        // Abstract method to accelerate the vehicle
        public abstract void accelerate();

        // Method to print vehicle details and acceleration behavior
        public void printDetails() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.print("Acceleration behavior: ");
            accelerate();
            System.out.println();
        }
}
