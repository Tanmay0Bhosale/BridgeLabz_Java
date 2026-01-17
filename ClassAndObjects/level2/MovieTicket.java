package ClassAndObjects.level2;

/**
 * The MovieTicket class represents a movie ticket with movie name, seat number, and price.
 * It provides methods to book a ticket with seat and price, and display the ticket details.
 */
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket by setting seat number and price
    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

    // Method to display the ticket details
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.movieName = "Inception";

        ticket.bookTicket(15, 250);
        ticket.displayTicket();
    }
}
