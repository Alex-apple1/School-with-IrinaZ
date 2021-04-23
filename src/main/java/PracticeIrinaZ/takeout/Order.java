package PracticeIrinaZ.takeout;

import static PracticeIrinaZ.takeout.utils.PrintUtils.PrintSpaces.*;
import static PracticeIrinaZ.takeout.utils.PrintUtils.CommonPrintMethods.*;

public class Order {

    private String clientName;
    private int orderNumber;
    private MainDish mainDishChoice;
    private Side sideChoice;
    private Drink drinkChoice;
    private double tips;
    private double totalPrice;

    private static int staticCount = 0;
    private int dynamicCount = 0;
    private static int operations = 0;

    public Order(String clientName) {
        this.clientName = clientName;
        this.orderNumber = ++ staticCount;
        dynamicCount++;
        operations ++;
    }

    public void cancelOrder() {
        dynamicCount --;
//        operations ++;
    }

    public void setStatusActive() {
        if (dynamicCount == 0) {
            dynamicCount ++;
        } else if (dynamicCount == 2) {
            dynamicCount --;
        }
//        operations ++;
    }

    public void setStatusDone() {
        if (dynamicCount == 1) {
            dynamicCount ++;
        }
//        operations ++;
    }

    public void printOrder() {
//        operations ++;
        printLine();
        print("Order#: " + orderNumber);
        print("  Client Name: " + clientName);
        print("  Dynamic Count: " + dynamicCount);
        print("  Operations: " + operations);
        printLine();
    }

}
