import java.util.ArrayList;
import java.util.Random;
public class StationSimulation {
    public static void main(String[] args) {     
        // Create and display 10 random vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vehicle v = new Vehicle(
                getRandomNumber(1, 20),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5),
                getRandomNumber(1, 5)
            );
            vehicles.add(v);
            System.out.println(v);
        }

        // Create drivers
        ArrayList<VehicleDriver> drivers = new ArrayList<>();
        String[] names = {"Lou", "Sue", "Drew", "Koo", "Murphy"};
        
        for (String name : names) {
            drivers.add(new VehicleDriver(name));
        }

        // Assign random vehicles to each driver
        for (VehicleDriver driver : drivers) {
            int index = getRandomNumber(0, 9);
            Vehicle v = vehicles.get(index);
            driver.addVehicle(v);
            do {
                index = getRandomNumber(0, 9);
                v = vehicles.get(index);
            } while (driver.addVehicle(v));

            System.out.println(driver);
        }

        // Select Lou and two random vehicles for testing canDrive()
        VehicleDriver lou = drivers.get(0); // Lou is the first driver
        Vehicle testVehicle1 = vehicles.get(getRandomNumber(0, 9));
        Vehicle testVehicle2 = vehicles.get(getRandomNumber(0, 9));

        // Test canDrive() method
        System.out.println("\nTesting canDrive() for Lou:");
        System.out.println("Can Lou drive vehicle " + testVehicle1.getPlateID() + "? " + lou.canDrive(testVehicle1));
        System.out.println("Can Lou drive vehicle " + testVehicle2.getPlateID() + "? " + lou.canDrive(testVehicle2));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
