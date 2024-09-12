import java.util.*;
import java.time.LocalDateTime;


interface MovieInfo {
    String getTitle();
    String getGenre();
    String getDirector();
}


interface CustomerInfo {
    String getFirstName();
    String getLastName();
    String getEmail();
    String getPhoneNumber();
}


interface PaymentProcessor {
    void processPayment(double amount);
}


interface AvailableSeatsUpdater {
    void updateAvailableSeats(int numTickets);
}


abstract class Booking implements MovieInfo, CustomerInfo, AvailableSeatsUpdater {
    private Showtime showtime;
    private Customer customer;
    private int numTickets;

    public Booking(Showtime showtime, Customer customer, int numTickets) {
        this.showtime = showtime;
        this.customer = customer;
        this.numTickets = numTickets;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public abstract double calculateTotalPrice();

    public void updateAvailableSeats(int numTickets) {
        showtime.updateAvailableSeats(numTickets);
    }

    @Override
    public String getTitle() {
        return showtime.getMovie().getTitle();
    }

    @Override
    public String getGenre() {
        return showtime.getMovie().getGenre();
    }

    @Override
    public String getDirector() {
        return showtime.getMovie().getDirector();
    }

    @Override
    public String getFirstName() {
        return customer.getFirstName();
    }

    @Override
    public String getLastName() {
        return customer.getLastName();
    }

    @Override
    public String getEmail() {
        return customer.getEmail();
    }

    @Override
    public String getPhoneNumber() {
        return customer.getPhoneNumber();
    }
}


class Movie implements MovieInfo {
    private String title;
    private String genre;
    private String director;

    public Movie(String title, String genre, String director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }
}


class Customer implements CustomerInfo {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Customer(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class Theatre {
    private String name;
    private String location;
    private List<Showtime> showtimes;

    public Theatre(String name, String location) {
        this.name = name;
        this.location = location;
        showtimes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Showtime> getShowtimes() {
        return showtimes;
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
    }

    public void removeShowtime(Showtime showtime) {
        showtimes.remove(showtime);
    }

    
}

class Showtime {
    private Movie movie;
    private LocalDateTime dateTime;
    private int availableSeats;
    private Theatre theatre;

    public Showtime(Movie movie, LocalDateTime dateTime, int availableSeats, Theatre theatre) {
        this.movie = movie;
        this.dateTime = dateTime;
        this.availableSeats = availableSeats;
        this.theatre = theatre;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void updateAvailableSeats(int numTickets) {
        availableSeats -= numTickets;
    }

    public Theatre getTheatre() {
        return theatre;
    }
}




class InPersonBooking extends Booking {
    private double discountPercentage;

    public InPersonBooking(Showtime showtime, Customer customer, int numTickets, double discountPercentage) {
        super(showtime, customer, numTickets);
        this.discountPercentage = discountPercentage;
    }

    public double calculateTotalPrice() {
        double ticketPrice = getShowtime().getMovie().getGenre().equals("Comedy") ? 10.0 : 8.0;
        double totalPrice = ticketPrice * getNumTickets();
        return totalPrice - (totalPrice * discountPercentage);
    }
}




class CashPaymentProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        
    }
}

class InvalidPaymentException extends Exception {
    public InvalidPaymentException(String message) {
        super(message);
    }
}


class InsufficientSeatsException extends Exception {
    public InsufficientSeatsException(String message) {
        super(message);
    }
}


public class MovieTicket {
    public static void main(String[] args) {
    
        Movie movie = new Movie("The Prestige", "Drama", "Nolan");

        
        Theatre theatre = new Theatre("IMAX", "Pheonix Mall");

        
        Showtime showtime = new Showtime(movie, LocalDateTime.of(2023, 4, 5, 15, 30), 100, theatre);

        
        theatre.addShowtime(showtime);

        
        Customer customer = new Customer("Khushal ", "Rathi", "kr@example.com", "123-456-7890");

        
        Booking booking = new InPersonBooking(showtime, customer, 2, 0.1);

        System.out.println("In-person booking successful for " + booking.getFirstName() + booking.getLastName() + "!");

        try {
            double totalPrice = booking.calculateTotalPrice();
            if (showtime.getAvailableSeats() >= booking.getNumTickets()) {
                booking.updateAvailableSeats(booking.getNumTickets());
            } else {
                throw new InsufficientSeatsException("Not enough seats available.");
            }
            PaymentProcessor paymentProcessor = new CashPaymentProcessor();
            paymentProcessor.processPayment(totalPrice);
        } catch ( InsufficientSeatsException e) {
            System.out.println(e.getMessage());
        }
    }
}






