package Week2Lab.Question3;

public class TestVehicle {

    public static void main(String[] args) {
        // Create instances of Car and Bike with appropriate arguments
        Car car = new Car("Toyota", "Camry", 2022);
        Bike bike = new Bike("Honda", "CBR500R", 2021);

        // Print details and acceleration behavior
        System.out.println("Car Details:");
        car.printDetails();

        System.out.println("Bike Details:");
        bike.printDetails();
    }
}
