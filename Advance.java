public class Advance extends Ticket {
    
    private int ticketNumber;
    private int daysInAdvance;
    private double price;
    
    private static final int firstLimit = 20;
	private static final int secondLimit = 10;
	
	private static final double earlyPrice = 15.0;
	private static final double middlePrice = 20.0;
	private static final double latestPrice = 40.0;
    
    public Advance(int ticketNumber, int daysInAdvance) {
        super(ticketNumber);
        
        this.daysInAdvance = daysInAdvance;
        
        if (daysInAdvance >= firstLimit) {
            super.price = earlyPrice;
        }
        else if (daysInAdvance < firstLimit && daysInAdvance > secondLimit) {
            super.price = middlePrice;
        }
        else {
            super.price = latestPrice;
        }
    }
    
    public String toString() {
        return super.toString();
    }

    
}
