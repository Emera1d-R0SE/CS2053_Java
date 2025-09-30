class TicketBooking {
    private int tickets = 5;

    public synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked ticket #" + tickets);
            tickets--;
        } else {
            System.out.println(name + " tried to book but tickets are sold out.");
        }
    }
}

class BookingThread extends Thread {
    TicketBooking booking;
    String user;

    BookingThread(TicketBooking booking, String user) {
        this.booking = booking;
        this.user = user;
    }

    public void run() {
        booking.bookTicket(user);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        for (int i = 1; i <= 7; i++) {
            new BookingThread(booking, "User" + i).start();
        }
    }
}
