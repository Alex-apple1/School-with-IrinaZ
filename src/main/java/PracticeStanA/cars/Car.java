package PracticeStanA.cars;

public class Car {
    String model;
    int year;
    int mpg;
    String color = "white";

    public Car(String model, int year, int mpg) {
        this.model = model;
        this.year = year;
        this.mpg = mpg;
    }

    public Car(String model, int year, int mpg, String color) {
        this.model = model;
        this.year = year;
        this.mpg = mpg;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }


}
