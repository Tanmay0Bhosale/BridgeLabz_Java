package oopsprogrammingfundamentals.level2;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

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
