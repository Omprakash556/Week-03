package circularlinkedlist.onlineticketreservationsystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tickets {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Tickets next;

    Tickets(int ticketID, String customerName, String movieName, String seatNumber) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.next = null;
    }
}
