public class BookingThread implements Runnable {
    private TicketingBookingSystem bookingSystem;
private String customerName;
private int numberOfTicketsToBook;

public BookingThread(TicketingBookingSystem bookingSystem, String customerName, int numberOfTicketsToBook) {
    this.customerName = customerName;
    this.bookingSystem = bookingSystem;
    this.numberOfTicketsToBook = numberOfTicketsToBook;

}

    @Override
    public void run() {
for(int i = 0; i < numberOfTicketsToBook; i++) {
    bookingSystem.bookTicket(customerName);
}
    }
}


