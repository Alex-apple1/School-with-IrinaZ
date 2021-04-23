package PracticeStanA.cars;

public class FleetUtils {

    static int ANNUAL_MILEAGE = 20000;
    static double PRICE_PER_GALLON = 3.75;

    public static void setPricePerGallon(double value) {
        PRICE_PER_GALLON = value;
    }

    public static void printFleetData(Car[] fleet) {
        for (int i = 0; i < fleet.length; i++) {
            System.out.println(fleet[i].getYear() + " " +
                    fleet[i].getModel() + " " +
                    fleet[i].getMpg() + " " +
                    fleet[i].getColor());
        }
    }

    public static double getAverageAge(Car[] fleet) {
        int ageSum = 0;
        for (int i = 0; i < fleet.length; i++) {
            ageSum += 2021 - fleet[i].getYear();
        }
        double result = (double) ageSum / fleet.length;
        return result;
    }

    public static double getFuelCost(Car[] fleet) {
        int cost = 0;
        for (int i = 0; i < fleet.length; i++) {
            cost += ANNUAL_MILEAGE / fleet[i].getMpg() * PRICE_PER_GALLON;
        }
        return cost;
    }

    public static void printAllData(Car[] fleet) {
        printFleetData(fleet);
        double avdAge = getAverageAge(fleet);

        System.out.println("Average car age: " + avdAge + " year(s)");

        double fuelCost = getFuelCost(fleet);

        System.out.println("Fuel cost of fleet per year: $" + fuelCost);
    }

}