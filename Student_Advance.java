public class Student_Advance extends Advance {
    
    public Student_Advance(int ticketNumber, int daysInAdvance){
		super(ticketNumber ,daysInAdvance);
    }
	public String toString() {
	    return super.toString() + " (ID Required)";
	}
	
}
