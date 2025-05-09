public class TicketingBookingSystem {
    private int availableTickets;

    public TicketingBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;

    }
    public int getAvailableTickets() {
        return availableTickets;
    }
    public synchronized boolean bookTicket(String customerName) {
        if(availableTickets > 0) {
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
         availableTickets--;
            System.out.println(customerName + " " + "Booked tickets: " + availableTickets);
            return true;
        }
else {
            System.out.println(customerName + "No tickets available");
            return false;
        }
    }
}
