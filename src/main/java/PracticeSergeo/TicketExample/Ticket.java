package PracticeSergeo.TicketExample;

public class Ticket extends Person  {
    double price;

    public Ticket(String name, int age, char sex) {
        super(name, age, sex);
    }

    public double getPrice() {
        if (age < 1 ) {
            price = 0;
        } else if (age < 18) {
            price *= 0.8;
        } else if (age > 55 && age < 100) {
            price *= 0.5;
        } else if (age > 100) {
            System.out.println("Enter valid age");
            price = 0;
        }
            return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
