package PracticeSergeo.TicketExample;

public class BuyTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Alex", 400, 'M');
        ticket.setPrice(100);

        System.out.println("Ticket for: " + ticket.getName());
        System.out.println("Ticket price: " + ticket.getPrice());
    }

}
