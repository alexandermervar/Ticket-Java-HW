public class MyProgram
{
    public static void main(String[] args)
    {
        //Declare Tickets
            Ticket[] tickets = new Ticket[6];
            
            tickets[0] = new Walk(1);
            
            tickets[1] = new Advance(2,12);
            tickets[2] = new Advance(3,8);
            tickets[3] = new Advance(4, 23);
            
            tickets[4] = new Student_Advance(5,17);
            tickets[5] = new Student_Advance(6,7);
            
            
        //Print Tickets
            for (int i = 0; i<6; i++) {
                System.out.println(tickets[i]);    }
    }
}