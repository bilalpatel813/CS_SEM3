class TicketBooking {
    int tickets = 1;

    public synchronized  void bookTicket(String person){
        if(tickets > 0){
            System.out.println(person + " Is booking a ticket...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets--;
            System.out.println(person + " Successfully booked the ticket.");
        } else {
            System.out.println("Sorry " + person + ", ticket already booked.");
        }
    }
}

class Person extends Thread {
    TicketBooking booking;
    String personName;

    Person(TicketBooking booking, String name) {
        this.booking = booking;
        this.personName = name;
    }

    public void run() {
        booking.bookTicket(personName);
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Person p1 = new Person(booking, "Adnan");
        Person p2 = new Person(booking, "Raza");
        
        p1.start();
        p2.start();
    }
}