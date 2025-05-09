public class TicketBookingMain {
    public static void main(String[] args) throws InterruptedException {
        int totalTickets = 5;
        TicketingBookingSystem bookingSystem = new TicketingBookingSystem(totalTickets);
        System.out.println("Available Total Tickets: " + bookingSystem.getAvailableTickets());

        BookingThread thread1 = new BookingThread(bookingSystem, "Yvette", 2);
        BookingThread thread2 = new BookingThread(bookingSystem, "Aline", 1);

        Thread t1 = new Thread(thread1, "Booking Thread1-1:");
        Thread t2 = new Thread(thread2, "Booking Thread2-1:");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Final Available Tickets: " + bookingSystem.getAvailableTickets());
        System.out.println("Total tickets booked: " + (totalTickets - bookingSystem.getAvailableTickets()));
    }
}
