package PracticeIrinaZ.takeout;

public final class Drink {
    private final String drinkName;
    private final double drinkPrice;

    public Drink(String name, double price) {
        this.drinkName = name;
        this.drinkPrice = price;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
}
