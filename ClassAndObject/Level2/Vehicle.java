package ConstructorsAndInstances.Level2;


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

    // Instance method
    public void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType +
                " | Fee: INR " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
