package ConstructorsAndInstances.Level1;

/**
 * The HotelBooking class represents a hotel booking with guest name, room type, and number of nights.
 * It provides default, parameterized, and copy constructors, and a method to display booking details.
 */
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor initializes with default values
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor initializes with provided values
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor creates a copy of another HotelBooking object
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Method to display the booking details
    public void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }
}

