public class Discount {
    public static void main(String[] args) {
        int cartTotal = 11000;
        double totalToPay = cartTotal;

        if (cartTotal > 1000) {
            System.out.println("Discount 15% was applied");
            totalToPay = cartTotal * 0.85;


        } else if (cartTotal > 500 && cartTotal < 1000) {
            System.out.println("Discount 10% was applied");
            totalToPay = cartTotal * 0.90;
        }  else {
            System.out.println("No discount was applied");
            totalToPay = cartTotal;
        }

        System.out.println(" Your total: " + totalToPay);
    }
}

