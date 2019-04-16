public class Ticket {
    private int ticketNumber;
    double price = 40.0;
    
    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String toString() {
        return "Number: " + ticketNumber + ", Price: $" + this.getPrice();
    }
}
