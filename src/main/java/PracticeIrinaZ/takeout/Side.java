package PracticeIrinaZ.takeout;

public class Side {
    private String sideName;
    private double sidePrice;

    public Side(String name, double price) {
        this.sideName = name;
        this.sidePrice = price;
    }

    public String getSideName() {
        return sideName;
    }

    public void setSideName(String name) {
        this.sideName = name;
    }

    public double getSidePrice() {
        return sidePrice;
    }

    public void setSidePrice(double price) {
        this.sidePrice = price;
    }
}
