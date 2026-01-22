package constructorsandinstances.Level2;

/**
 * The Vehicle class represents a vehicle with owner name, type, and a static registration fee.
 * It demonstrates instance and static variables and methods.
 */
public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType +
                " | Fee: INR " + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
